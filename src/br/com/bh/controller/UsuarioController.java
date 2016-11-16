/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bh.controller;

import br.com.bh.modelo.dao.UsuarioDAO;
import br.com.bh.modelo.entidade.Usuario;
import java.sql.SQLException;


public class UsuarioController {
  
        public UsuarioController() {
    }
    public boolean validaUsuario (String login, String senha) throws SQLException{
        UsuarioDAO dao = new UsuarioDAO();
        Usuario usuario = dao.login(login, senha);
            //  usu = dao.login(usuario, senha);
            return null != usuario;
        }
    
}
