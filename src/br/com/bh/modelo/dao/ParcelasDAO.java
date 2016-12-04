package br.com.bh.modelo.dao;

import br.com.bh.modelo.entidade.Cliente;
import br.com.bh.modelo.entidade.Financiamento;
import br.com.bh.modelo.entidade.Parcela;
import br.com.bh.utils.CreateDaoException;
import br.com.bh.utils.Data;
import br.com.bh.utils.GenericDAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ParcelasDAO {

    private GenericDAO daoHelper;
    Calendar c = Calendar.getInstance();

    public ParcelasDAO() {

        daoHelper = new GenericDAO();
    }

    public void inserir(ArrayList<Parcela> parcelas) throws CreateDaoException {

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            daoHelper.getConnection();
            conn = daoHelper.getConnection();
            for (int linha = 1 ; linha < parcelas.size()-1; linha++) {
                Parcela parcela = parcelas.get(linha);
                stmt = conn.prepareStatement("INSERT INTO parcela(numero_parcela, valor_parcela, data_parcela, id_financiamento) VALUES (?, ?, ?, ?);");
                int index = 0;
                stmt.setLong(++index, parcela.getNumeroParcela());
                stmt.setDouble(++index, parcela.getValor());
                stmt.setDate(++index, (Date) parcela.getData());
                stmt.setInt(++index, parcela.getFinanciamento().getId());
                stmt.executeUpdate();

            }

        } catch (SQLException e) {
            throw new CreateDaoException("Não foi possível realizar a transação", e);
        } finally {
            daoHelper.releaseAll(conn, stmt);

        }

    }
    
            public Cliente buscaCliente(Cliente cliente) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            daoHelper.getConnection();
            conn = daoHelper.getConnection();
            stmt = conn.prepareStatement("select * from cliente where id = ?");
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
                
                c.setTime(new java.util.Date(rset.getDate("data_nasc").getTime()));
                
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

}
