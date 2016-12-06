
package br.com.bh.modelo.dao;

import br.com.bh.modelo.entidade.Cliente;
import br.com.bh.modelo.entidade.Financiamento;
import br.com.bh.utils.CreateDaoException;
import br.com.bh.utils.Data;
import br.com.bh.utils.GenericDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


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
            rset.next();
           financiamento.setId(rset.getInt(1));

             

        } catch (SQLException e) {
            throw new CreateDaoException("Não foi possível realizar a transação", e);
        } finally {
            daoHelper.releaseAll(conn, stmt);

        }
        return financiamento;

    }
        public Cliente buscaFinanciamento(Cliente cliente) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            daoHelper.getConnection();
            conn = daoHelper.getConnection();
            stmt = conn.prepareStatement("select f.id, f.cliente_id, f.valor, f.parcelas, f.taxa, f.tipo, f.data, c.nome, c.cpf, c.salario, c.ocupacao, c.email  from financiamento f inner join cliente c on c.id = f.cliente_id  where c.id = 14");
            int index = 0;
            stmt.setLong(++index, cliente.getId());
            ResultSet rset = stmt.executeQuery();

            while (rset.next()) {

                cliente = new Cliente();
                

                cliente.setId(rset.getInt("id"));

                cliente.setNome(rset.getString("nome"));

                cliente.setRg(rset.getString("rg"));

                cliente.setSexo(rset.getString("sexo"));

                cliente.setEndereco(rset.getString("endereco"));

                cliente.setCpf(rset.getString("cpf"));

                cliente.setTelefone(rset.getString("telefone"));

                cliente.setCelular(rset.getString("celular"));

                cliente.setMargem(rset.getDouble("margem"));

                cliente.setSalario(rset.getDouble("salario"));

                Calendar c = Calendar.getInstance();

                c.setTime(new Date(rset.getDate("data_nasc").getTime()));

                cliente.setData_nascimento(c);

                cliente.setEmail(rset.getString("email"));

                cliente.setOcupacao(rset.getString("ocupacao"));

                cliente.setInformacoes(rset.getString("informacoes_adicionais"));

                cliente.setCep(rset.getString("cep"));

            }

        } catch (SQLException e) {
            throw new CreateDaoException("Não foi possível realizar a transação", e);
        } finally {
            daoHelper.releaseAll(conn, stmt);
        }
        return cliente;
    }
       public List<Cliente> listaCliente(Long idCliente) throws SQLException {

        Connection conn = null;

        PreparedStatement stmt = null;

        final List<Financiamento> financiamentos = new ArrayList<Financiamento>();

        try {

            conn = daoHelper.getConnection();

            stmt = conn.prepareStatement("select f.id, f.cliente_id, f.valor, f.parcelas, f.taxa, f.tipo, f.data, c.nome, c.cpf, c.salario, c.ocupacao, c.email  from financiamento f inner join cliente c on c.id = f.cliente_id  where c.id = ?");

            int index = 0;
            stmt.setLong(++index, idCliente);

            ResultSet rset = stmt.executeQuery();

            Cliente cliente;

            while (rset.next()) {

               Financiamento financiamento = new Financiamento();
               
               financiamento.setId(rset.getInt("id"));

                cliente.setId(rset.getInt("id"));

                cliente.setNome(rset.getString("nome"));

                cliente.setRg(rset.getString("rg"));

                cliente.setSexo(rset.getString("sexo"));

                cliente.setEndereco(rset.getString("endereco"));

                cliente.setCpf(rset.getString("cpf"));

                cliente.setTelefone(rset.getString("telefone"));

                cliente.setCelular(rset.getString("celular"));

                cliente.setMargem(rset.getDouble("margem"));

                cliente.setSalario(rset.getDouble("salario"));

                cliente.setOcupacao(rset.getString("ocupacao"));
                

          

//                Calendar c = Calendar.getInstance(); 
//                
//                c.setTime(new Date(rset.getDate("data").getTime()));
//                
//                cliente.setData_nascimento(c);
                financiamentos.add(financiamento);
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return financiamentos;
    } 
}
