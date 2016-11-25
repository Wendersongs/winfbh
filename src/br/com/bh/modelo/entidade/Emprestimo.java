
package br.com.bh.modelo.entidade;

import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Objects;

public class Emprestimo {
    
    private int id;
    private Cliente cliente;
    private double valor;
    private Calendar dataContrata; 
    private double taxa;
    private Parcela parcela;

    public Emprestimo(int id, Cliente cliente, double valor, Calendar dataContrata, double taxa, Parcela parcela) {
        this.id = id;
        this.cliente = cliente;
        this.valor = valor;
        this.dataContrata = dataContrata;
        this.taxa = taxa;
        this.parcela = parcela;
    }

    public Emprestimo(int id) {
        this.id = id;
    }

    public Emprestimo(Cliente cliente, double valor, Calendar dataContrata, double taxa, Parcela parcela) {
        this.cliente = cliente;
        this.valor = valor;
        this.dataContrata = dataContrata;
        this.taxa = taxa;
        this.parcela = parcela;
    }

    public Emprestimo(int id, Cliente cliente, double valor, Calendar dataContrata, double taxa) {
        this.id = id;
        this.cliente = cliente;
        this.valor = valor;
        this.dataContrata = dataContrata;
        this.taxa = taxa;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Calendar getData_atual() {
        return dataContrata;
    }

    public void setData_atual(Calendar dataContrata) {
        this.dataContrata = dataContrata;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public Parcela getParcela() {
        return parcela;
    }

    public void setParcela(Parcela parcela) {
        this.parcela = parcela;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.cliente);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.valor) ^ (Double.doubleToLongBits(this.valor) >>> 32));
        hash = 29 * hash + Objects.hashCode(this.dataContrata);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.taxa) ^ (Double.doubleToLongBits(this.taxa) >>> 32));
        hash = 29 * hash + Objects.hashCode(this.parcela);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Emprestimo other = (Emprestimo) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.valor) != Double.doubleToLongBits(other.valor)) {
            return false;
        }
        if (Double.doubleToLongBits(this.taxa) != Double.doubleToLongBits(other.taxa)) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        if (!Objects.equals(this.dataContrata, other.dataContrata)) {
            return false;
        }
        if (!Objects.equals(this.parcela, other.parcela)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Emprestimo{" + "id=" + id + ", cliente=" + cliente + ", valor=" + valor + ", dataContrata=" + dataContrata + ", taxa=" + taxa + ", parcela=" + parcela + '}';
    }
    
}
