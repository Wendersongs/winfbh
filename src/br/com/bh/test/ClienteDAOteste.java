

package br.com.bh.test;

import br.com.bh.modelo.dao.ClienteDAO;
import br.com.bh.modelo.entidade.Cliente;
import br.com.bh.modelo.entidade.SexoType;


public class ClienteDAOteste {
    
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente ("WENDERSON", "38411", SexoType.M,  "917054", 0, 0);
        ClienteDAO dao = new ClienteDAO();
        dao.inserir(cliente);
    }
    
}
