
package br.com.bh.modelo.dao;

import br.com.bh.modelo.entidade.Financiamento;
import br.com.bh.utils.CreateDaoException;
import br.com.bh.utils.Data;
import br.com.bh.utils.GenericDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;


public class FinanciamentoDao {
    
    private GenericDAO daoHelper;
    Calendar c = Calendar.getInstance();

    public FinanciamentoDao() {
        
         daoHelper = new GenericDAO();
    }
        public Financiamento inserir(Financiamento financiamento) throws CreateDaoException {
        int i = 0;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rset = null; 
       

        try {
            daoHelper.getConnection();
            conn = daoHelper.getConnection();
            stmt = conn.prepareStatement("INSERT INTO financiamento(cliente_id, valor, parcelas, taxa, tipo,data) VALUES (?, ?, ?, ?, ?, ?)",PreparedStatement.RETURN_GENERATED_KEYS);
            int index = 0;
            stmt.setLong(++index, financiamento.getCliente().getId());
            stmt.setDouble(++index, financiamento.getValor());
            stmt.setInt(++index, financiamento.getQtdParcelas());
            stmt.setDouble(++index, financiamento.getTaxa());
            stmt.setString(++index, financiamento.getTipo());
            stmt.setDate(++index, new java.sql.Date (Data.getPegaDataAtual().getTimeInMillis()));
                              
            stmt.executeUpdate();
            rset = stmt.getGeneratedKeys();
            if (rset.next()){
                financiamento.setId(rset.getInt(i));

            } 

        } catch (SQLException e) {
            throw new CreateDaoException("Não foi possível realizar a transação", e);
        } finally {
            daoHelper.releaseAll(conn, stmt);

        }
        return financiamento;

    }
    
    
}
