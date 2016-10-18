
package br.com.bh.modelo.dao;

import br.com.bh.modelo.entidade.Cliente;
import br.com.bh.utils.GenericDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ClienteDAO {
    private GenericDAO daoHelper;

    public ClienteDAO() {
        
        daoHelper = new GenericDAO();
    }
    
    
    
    
    
  public void inserir(Cliente cliente) {
      
      Connection conn = null;
      PreparedStatement stmt = null;
      
      try {
       
          conn = daoHelper.getConnection();
          stmt = conn.prepareStatement("insert into cliente (contato,cpf,data_nasc,margem,nome,rg,salario,sexo,data_cadastro) values (?,?,?,?,?,?,?,?)");
          int index = 0;
          stmt.setString(++index, cliente.getContato().toString());
          stmt.setString(index++, cliente.getCpf());
          stmt.setString(index++, cliente.getData_nascimento().toString());
          stmt.setString(index++, Double.toString(cliente.getMargem()));
          stmt.setString(index++, cliente.getNome());
          stmt.setString(index++, cliente.getRg());
          stmt.setString(index++, cliente.getSexo().toString());
          stmt.setString(index++, daoHelper.dataAtual());
          
      } catch (Exception e) {
      }
      finally{
      
      
      }
      
      
 
  
  } 
    
}
