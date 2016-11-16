
package br.com.bh.test;

import br.com.bh.modelo.dao.ClienteDAO;
import br.com.bh.view.JFramePrincipal;
import br.com.bh.view.frmLogin;
import javax.swing.JFrame;


public class Main {
    
    public static void main(String[] args) {
       ClienteDAO dao = new ClienteDAO();
 
//       JFrame principal = new JFramePrincipal();
//       principal.setVisible(true);  
       
       JFrame login = new frmLogin();
       login.setVisible(true);
    
}
}