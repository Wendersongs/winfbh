package br.com.bh.modelo.dao;

import br.com.bh.modelo.entidade.Cliente;
import br.com.bh.utils.CreateDaoException;
import br.com.bh.utils.Data;
import br.com.bh.utils.GenericDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class ClienteDAO {

    private GenericDAO daoHelper;
    Calendar c = Calendar.getInstance();

    public ClienteDAO() {

        daoHelper = new GenericDAO();
    }

    public void inserir(Cliente cliente) throws CreateDaoException {

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            daoHelper.getConnection();
            conn = daoHelper.getConnection();
            stmt = conn.prepareStatement("insert into cliente (nome, rg, sexo, endereco, cpf, telefone, celular, salario, margem,email,ocupacao,cep,informacoes_adicionais,data_nasc, data_cadastro) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
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

            stmt.setString(++index, cliente.getEmail());

            stmt.setString(++index, cliente.getOcupacao());

            stmt.setString(++index, cliente.getCep());

            stmt.setString(++index, cliente.getInformacoes());

            stmt.setDate(++index, new java.sql.Date(cliente.getData_nascimento().getTimeInMillis()));

            stmt.setDate(++index, new java.sql.Date(Data.getPegaDataAtual().getTimeInMillis()));

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new CreateDaoException("Não foi possível realizar a transação", e);
        } finally {
            daoHelper.releaseAll(conn, stmt);

        }

    }

    public void atualizar(Cliente cliente) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            daoHelper.getConnection();
            conn = daoHelper.getConnection();
            stmt = conn.prepareStatement("update cliente set nome = ?, rg = ?, sexo = ?, endereco = ?, cpf = ?, telefone = ?, celular = ?, salario = ?, margem = ? where id = ?");
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

            stmt.setLong(++index, cliente.getId());

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new CreateDaoException("Não foi possível realizar a transação", e);
        } finally {
            daoHelper.releaseAll(conn, stmt);

        }

    }

    public void deletar(Cliente cliente) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            daoHelper.getConnection();
            conn = daoHelper.getConnection();
            stmt = conn.prepareStatement("delete from cliente where id = ?");
            int index = 0;
            stmt.setLong(++index, cliente.getId());
            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new CreateDaoException("Não foi possível realizar a transação", e);
        } finally {
            daoHelper.releaseAll(conn, stmt);
        }
    }

    public Cliente buscaCliente(Cliente cliente) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            daoHelper.getConnection();
            conn = daoHelper.getConnection();
            stmt = conn.prepareStatement("select * from cliente where id = ?");
            int index = 0;
            stmt.setLong(++index, cliente.getId());
            ResultSet rset = stmt.executeQuery();

            while (rset.next()) {

                cliente = new Cliente();

                cliente.setId(rset.getInt("id"));

                cliente.setNome(rset.getString("nome"));

                cliente.setRg(rset.getString("rg"));

                cliente.setSexo(rset.getString("sexo"));

                cliente.setEndereco(rset.getString("endereco"));

                cliente.setCpf(rset.getString("cpf"));

                cliente.setTelefone(rset.getString("telefone"));

                cliente.setCelular(rset.getString("celular"));

                cliente.setMargem(rset.getDouble("margem"));

                cliente.setSalario(rset.getDouble("salario"));

                Calendar c = Calendar.getInstance();

                c.setTime(new Date(rset.getDate("data_nasc").getTime()));

                cliente.setData_nascimento(c);

                cliente.setEmail(rset.getString("email"));

                cliente.setOcupacao(rset.getString("ocupacao"));

                cliente.setInformacoes(rset.getString("informacoes_adicionais"));

                cliente.setCep(rset.getString("cep"));

            }

        } catch (SQLException e) {
            throw new CreateDaoException("Não foi possível realizar a transação", e);
        } finally {
            daoHelper.releaseAll(conn, stmt);
        }
        return cliente;
    }
public Double buscaDividas(long idCliente) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        Double dividas = 0.0;

        try {
            daoHelper.getConnection();
            conn = daoHelper.getConnection();
            stmt = conn.prepareStatement("select  c.id,sum(p.valor_parcela) as margem,extract(month FROM p.data_parcela)as mes, extract (year FROM p.data_parcela)as ano from cliente c \n" +
                                         "inner join financiamento f on f.cliente_id = c.id\n" +
                                         "inner join parcela p on p.id_financiamento = f.id  where c.id = ? \n" +
                                         "and (p.data_parcela) > now() and (p.data_parcela) <= (now()+interval '31 days')\n" +
                                         "group by c.id,mes,ano\n" +
                                         "order by mes");
            int index = 0;
            
            stmt.setLong(++index, idCliente);
           
            ResultSet rset = stmt.executeQuery();
            
            
            if (!rset.next()){
            return dividas;
            }
            else{
            dividas = rset.getDouble("margem");
            return dividas;
            }

        } catch (SQLException e) {
            throw new CreateDaoException("Não foi possível realizar a transação", e);
        } finally {
            daoHelper.releaseAll(conn, stmt);
        }
        
    }


    public List<Cliente> listaTodosClientes() throws SQLException {

        Connection conn = null;

        PreparedStatement stmt = null;

        final List<Cliente> clientes = new ArrayList<Cliente>();

        try {

            conn = daoHelper.getConnection();

            stmt = conn.prepareStatement("select * from cliente order by nome");

            ResultSet rset = stmt.executeQuery();

            Cliente cliente;

            while (rset.next()) {

                cliente = new Cliente();

                cliente.setId(rset.getInt("id"));

                cliente.setNome(rset.getString("nome"));

                cliente.setRg(rset.getString("rg"));

                cliente.setSexo(rset.getString("sexo"));

                cliente.setEndereco(rset.getString("endereco"));

                cliente.setCpf(rset.getString("cpf"));

                cliente.setTelefone(rset.getString("telefone"));

                cliente.setCelular(rset.getString("celular"));

                cliente.setMargem(rset.getDouble("margem"));

                cliente.setSalario(rset.getDouble("salario"));

                Calendar c = Calendar.getInstance();

                c.setTime(new Date(rset.getDate("data_nasc").getTime()));

                cliente.setData_nascimento(c);

                cliente.setEmail(rset.getString("email"));

                cliente.setOcupacao(rset.getString("ocupacao"));

                cliente.setInformacoes(rset.getString("informacoes_adicionais"));

                cliente.setCep(rset.getString("cep"));

                clientes.add(cliente);
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return clientes;
    }

    public List<Cliente> listaCliente(String cpf) throws SQLException {

        Connection conn = null;

        PreparedStatement stmt = null;

        final List<Cliente> clientes = new ArrayList<Cliente>();

        try {

            conn = daoHelper.getConnection();

            stmt = conn.prepareStatement("select * from cliente  where cpf = ? limit 1");

            int index = 0;
            stmt.setString(++index, cpf);

            ResultSet rset = stmt.executeQuery();

            Cliente cliente;

            while (rset.next()) {

                cliente = new Cliente();

                cliente.setId(rset.getInt("id"));

                cliente.setNome(rset.getString("nome"));

                cliente.setRg(rset.getString("rg"));

                cliente.setSexo(rset.getString("sexo"));

                cliente.setEndereco(rset.getString("endereco"));

                cliente.setCpf(rset.getString("cpf"));

                cliente.setTelefone(rset.getString("telefone"));

                cliente.setCelular(rset.getString("celular"));

                cliente.setMargem(rset.getDouble("margem"));

                cliente.setSalario(rset.getDouble("salario"));

                cliente.setOcupacao(rset.getString("ocupacao"));
                
                Double margem = (cliente.getMargem());
                Double divida = (buscaDividas(cliente.getId()));
                
                if (((cliente.getMargem()) - (buscaDividas(cliente.getId())))<0.0){
                cliente.setMargem(0.0);
                       
                
                }
                else{
                cliente.setMargem((cliente.getMargem()) - (buscaDividas(cliente.getId())));
                
                }

//                Calendar c = Calendar.getInstance(); 
//                
//                c.setTime(new Date(rset.getDate("data").getTime()));
//                
//                cliente.setData_nascimento(c);
                clientes.add(cliente);
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return clientes;
    }

    public List<Cliente> listaClienteFiltradoNome(String nome) throws SQLException {

        Connection conn = null;

        PreparedStatement stmt = null;

        final List<Cliente> clientes = new ArrayList<Cliente>();

        try {

            conn = daoHelper.getConnection();

            stmt = conn.prepareStatement("select * from cliente where nome like ?");

            int index = 0;
            stmt.setString(++index, '%' + nome + '%');

            ResultSet rset = stmt.executeQuery();

            Cliente cliente;

            while (rset.next()) {

                cliente = new Cliente();

                cliente.setId(rset.getInt("id"));

                cliente.setNome(rset.getString("nome"));

                cliente.setRg(rset.getString("rg"));

                cliente.setSexo(rset.getString("sexo"));

                cliente.setEndereco(rset.getString("endereco"));

                cliente.setCpf(rset.getString("cpf"));

                cliente.setTelefone(rset.getString("telefone"));

                cliente.setCelular(rset.getString("celular"));

                cliente.setMargem(rset.getDouble("margem"));

                cliente.setSalario(rset.getDouble("salario"));

                cliente.setOcupacao(rset.getString("ocupacao"));

//                Calendar c = Calendar.getInstance(); 
//                
//                c.setTime(new Date(rset.getDate("data").getTime()));
//                
//                cliente.setData_nascimento(c);
                clientes.add(cliente);
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return clientes;
    }
}
