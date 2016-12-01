
package br.com.bh.modelo.dao;

import br.com.bh.modelo.entidade.Financiamento;
import br.com.bh.modelo.entidade.Parcela;
import br.com.bh.utils.CreateDaoException;
import br.com.bh.utils.Data;
import br.com.bh.utils.GenericDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;


public class ParcelasDAO {
    
    private GenericDAO daoHelper;
    Calendar c = Calendar.getInstance();

    public ParcelasDAO() {
        
         daoHelper = new GenericDAO();
    }
        public void inserir(Parcela parcela) throws CreateDaoException {

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            daoHelper.getConnection();
            conn = daoHelper.getConnection();
            stmt = conn.prepareStatement("INSERT INTO parcela(numero_parcela, valor_parcela, data_parcela, id_financiamento) VALUES (?, ?, ?, ?);");
            int index = 0;
            stmt.setLong(++index, parcela.getCliente().getId());
            stmt.setDouble(++index, parcela.getValor());
            stmt.setInt(++index, parcela.getQtdParcelas());
            stmt.setDouble(++index, parcela.getTaxa());
            stmt.setString(++index, parcela.getTipo());
            stmt.setDate(++index, new java.sql.Date (Data.getPegaDataAtual().getTimeInMillis()));
                              
            stmt.executeUpdate();

           

        } catch (SQLException e) {
            throw new CreateDaoException("Não foi possível realizar a transação", e);
        } finally {
            daoHelper.releaseAll(conn, stmt);

        }

    }
    
    
}


