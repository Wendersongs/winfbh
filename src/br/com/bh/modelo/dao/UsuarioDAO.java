
package br.com.bh.modelo.dao;

import br.com.bh.modelo.entidade.Usuario;
import br.com.bh.utils.GenericDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    
     private GenericDAO daoHelper;

    public UsuarioDAO() {

        daoHelper = new GenericDAO();
    }
 
    public Usuario login(String login, String senha) throws SQLException {
        Usuario usuario = null;
        Connection conn = null;
        
        conn = daoHelper.getConnection();
        PreparedStatement ps = null;
        ps = conn.prepareStatement("SELECT * FROM Usuario WHERE login=? AND senha=?");
        
        
        ps.setObject(1, login);
        ps.setObject(2, senha);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            usuario = new Usuario();
            usuario.setLogin(rs.getString("usuario"));
            /// ....
        }
        return usuario;
    }
}
