
package br.com.bh.modelo.dao;

import br.com.bh.modelo.entidade.Endereco;
import br.com.bh.utils.CreateDaoException;
import br.com.bh.utils.GenericDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EnderecoDAO {
    
    private GenericDAO daoHelper;

    public EnderecoDAO() {
        daoHelper = new GenericDAO();
    }

    public void insert (Endereco endereco){
        int i = 0;
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rset = null;
        try {
            
            conn = daoHelper.getConnection();
            pstmt = conn.prepareStatement("INSERT INTO endereco(bairro, cidade, uf, complemento, cep) VALUES (?, ?, ?, ?, ?)"
                                            ,PreparedStatement.RETURN_GENERATED_KEYS);
            pstmt.setString(++i, endereco.getBairro());
            pstmt.setString(++i, endereco.getCidade());
            pstmt.setString(++i, endereco.getUf());
            pstmt.setString(++i, endereco.getComplemento());
            pstmt.setString(++i, endereco.getCep());
            rset = pstmt.getGeneratedKeys();
            if (rset.next()){
                endereco.setId((int) rset.getLong(i));
            }
            
            
        } catch (SQLException e) {
            throw new CreateDaoException("Não foi possível armazenar Endereco", e);
        }
        
        
    
    }
  
    
    
    
}
