
package br.com.bh.modelo.dao;

import br.com.bh.modelo.entidade.Cliente;
import br.com.bh.utils.CreateDaoException;
import br.com.bh.utils.GenericDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ClienteDAO {
    private GenericDAO daoHelper;

    public ClienteDAO() {
        
        daoHelper = new GenericDAO();
    }
    
    
    
    
    
  public void inserir(Cliente cliente) throws CreateDaoException {
      
      Connection conn = null;
      PreparedStatement stmt = null;
      
      try {
       
          conn = daoHelper.getConnection(); ////(String nome, String rg, SexoType sexo, String cpf, double salario, double margem)
          stmt = conn.prepareStatement("insert into cliente (cpf,nome,rg,sexo) values (?,?,?,?)");
          int index = 0;
          //stmt.setString(++index, cliente.getContato().toString());
          stmt.setString(++index, cliente.getCpf());
        //  stmt.setString(++index, cliente.getData_nascimento().toString());
      //    stmt.setString(++index, Double.toString(cliente.getMargem()));
          stmt.setString(++index, cliente.getNome());
          stmt.setString(++index, cliente.getRg());
       //   stmt.setString(++index, Double.toString(cliente.getSalario()));
          stmt.setString(++index, cliente.getSexo().toString());
        //  stmt.setString(++index, daoHelper.dataAtual());
          System.out.println(stmt.toString());
          stmt.executeUpdate();
          
      } catch (Exception e) {
          throw new CreateDaoException("Não foi possível realizar a transação", e);
      }
      finally{
      daoHelper.releaseAll(conn, stmt);
      
      }
      
      
 
  
  } 
    
}
