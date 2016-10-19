
package br.com.bh.utils;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;
import java.text.SimpleDateFormat;


public class GenericDAO {

	private static final ThreadLocal<Connection> context = new ThreadLocal<Connection>();

	/**
	 * Fornecer conexao ao banco de dados
	 * 
	 * @return Connection
	 * @throws SQLExceptione
	 */
	public Connection getConnection() throws SQLException { // **** CONECTA NO BANCO 

		Connection conn = null;
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/winf","postgres","123456");
		} catch (ClassNotFoundException e) {
			//TODO refatorar para dar suporte a resourcebundle.
			throw new ConnectionFailureDaoException( "Não foi possível realizar a conexao", e  );
		}

		return conn;

	}

	public String dataAtual (){
            Date data = new Date(System.currentTimeMillis());  
            SimpleDateFormat formatarDate = new SimpleDateFormat("yyyy-MM-dd"); 
            return data.toString();
        }
	
	public void beginTransaction() throws SQLException { //INICIA UMA TRANSAÇÃO, ABRE UMA CONEXÃO DO TIPO TRANSACIONAL
		if (isTransactionStarted()) return; // << 13 -- provide support to transaction propagation
		Connection conn = getConnection();
		conn.setAutoCommit(false);
		context.set(conn);
	}

	
	private boolean isTransactionStarted () {
		return ( context.get() != null );
	}
	
	public void endTransaction() throws SQLException {
		commit(getConnectionFromContext());
		releaseTransaction();
	}

	public void releaseTransaction() throws SQLException {
		Connection conn = getConnectionFromContext();
		release(conn);
		context.remove();
	}

	public void rollbackTransaction() {
		Connection conn;
		try {
			conn = getConnectionFromContext();
			rollback(conn);
			release(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		context.remove();
	}

	public void commit(Connection conn) throws SQLException {
		conn.commit();
	}

	public void rollback(Connection conn) throws SQLException {
		if (conn != null)
			conn.rollback();
	}

	public Connection getConnectionFromContext() throws SQLException {

		Connection conn = context.get();

		if (conn == null)
			throw new SQLException("Transação invalida");

		if (conn.isClosed())
			throw new SQLException(
					"Transação invalida, Conexao esta fechada :Z");

		return conn;

	}

	public long executePreparedUpdateAndReturnGeneratedKeys(Connection conn,
															String query
															, Object... params) 
																		throws SQLException {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		long result = 0l;
		try {
			pstmt = conn.prepareStatement(query,
					PreparedStatement.RETURN_GENERATED_KEYS);
			int i = 0;
			for (Object param : params) {
				pstmt.setObject(++i, param);
			}

			pstmt.executeUpdate();

			rset = pstmt.getGeneratedKeys();

			if (rset.next())
				result = rset.getLong(1);

		} finally {
			release(pstmt);
			release(rset);
		}
		return result;
	}

	public void executePreparedUpdate(Connection conn, String query,
			Object... params) throws SQLException {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(query);
			int i = 0;
			for (Object param : params) {
				pstmt.setObject(++i, param);
			}
			pstmt.executeUpdate();
		} finally {
			release(pstmt);
		}
	}
	
	public void executePreparedUpdateIntoSingleTransaction ( String query,
															Object... params) 
															throws SQLException {
		executePreparedUpdate(getConnection(), query, params);
	}

	public void executePreparedUpdate( String query,
										Object... params) 
													throws SQLException {
		
		executePreparedUpdate(getConnectionFromContext(), query, params);
	}

	public <T> List<T> executePreparedQuery ( String query,
											QueryMapper<T> mapper ) 
															throws SQLException {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		
		List<T> list = new ArrayList<T>();
		
		try {
			conn =	getConnection();
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			list = mapper.mapping(rset);
		} finally {
			releaseAll(conn, stmt, rset);
		}
		
		return list;
		
	}

	public void release(Statement stmt) {      // ******* LIBERA O STATEMENT
		if (stmt == null) return;
		try {
			stmt.close();
		} catch (SQLException e) {
		}
	}

	public void release(Connection conn) {  // ******** LIBERA A CONEXÃO COM O BANCO

		if (conn == null) return;
		try {
			conn.close();
		} catch (SQLException e) {
		}

	}

	public void release(ResultSet rset) {  /// ********** LIBERA O RESULT SET
		if (rset == null) return;
		try {
			rset.close();
		} catch (SQLException e) {
		}
	}

	public void releaseAll(Connection conn, Statement stmt) {  ////******* LIBERA CONEXÃO E STATEMENT
		release(stmt);
		release(conn);
	}

	public void releaseAll(Connection conn, Statement stmt, ResultSet rset) {  ////******* LIBERA CONEXÃO, STATEMENT E RESULT SET
		release(rset);
		releaseAll(conn, stmt);
	}

}