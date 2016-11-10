
package br.com.bh.modelo.dao;

import br.com.bh.modelo.entidade.Cliente;
import br.com.bh.utils.CreateDaoException;
import br.com.bh.utils.GenericDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {
    private GenericDAO daoHelper;

    public ClienteDAO() {
        
        daoHelper = new GenericDAO();
    }
    
    
    
    
    
  public void inserir(Cliente cliente) throws CreateDaoException {
      
      Connection conn = null;
      PreparedStatement stmt = null;
      
    
      try {
          daoHelper.getConnection();
          conn = daoHelper.getConnection();
          stmt = conn.prepareStatement("insert into cliente (nome, rg, sexo, endereco, cpf, telefone, celular, salario, margem) values (?,?,?,?,?,?,?,?,?)");
          int index = 0;
          stmt.setString(++index, cliente.getNome());
          stmt.setString(++index, cliente.getRg());
          stmt.setString(++index, cliente.getSexo());
          stmt.setString(++index, cliente.getEndereco());
          stmt.setString(++index, cliente.getCpf());
          stmt.setString(++index, cliente.getTelefone());
          stmt.setString(++index, cliente.getCelular());
          stmt.setDouble(++index, cliente.getSalario());
          stmt.setDouble(++index, cliente.getMargem());
          stmt.executeUpdate();
        
          System.out.println(stmt.toString());
            
          
      } catch (SQLException e) {
          throw new CreateDaoException("Não foi possível realizar a transação", e);
      }
      finally{
      daoHelper.releaseAll(conn, stmt);
      
      }
      
      
 
  
  } 
    
}
