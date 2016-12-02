package br.com.bh.modelo.dao;

import br.com.bh.modelo.entidade.Financiamento;
import br.com.bh.modelo.entidade.Parcela;
import br.com.bh.utils.CreateDaoException;
import br.com.bh.utils.Data;
import br.com.bh.utils.GenericDAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
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
            for (int linha = 1 ; linha < parcelas.size(); linha++) {
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

}
