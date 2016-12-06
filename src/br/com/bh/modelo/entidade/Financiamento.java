
package br.com.bh.modelo.entidade;

import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Objects;

public class Financiamento {
    
    private int id;
    private Cliente cliente;
    private double valor;
    private Calendar dataContrata; 
    private int qtdParcelas;
    private double taxa;
    private String tipo;

    public Financiamento(int id, Cliente cliente, double valor, Calendar dataContrata, int qtdParcelas, double taxa, String tipo) {
        this.id = id;
        this.cliente = cliente;
        this.valor = valor;
        this.dataContrata = dataContrata;
        this.qtdParcelas = qtdParcelas;
        this.taxa = taxa;
        this.tipo = tipo;
    }

    public Financiamento() {
    }

    public Financiamento(Cliente cliente, double valor, Calendar dataContrata, int qtdParcelas, double taxa, String tipo) {
        this.cliente = cliente;
        this.valor = valor;
        this.dataContrata = dataContrata;
        this.qtdParcelas = qtdParcelas;
        this.taxa = taxa;
        this.tipo = tipo;
    }

    public Financiamento(int id) {
        this.id = id;
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

    public Calendar getDataContrata() {
        return dataContrata;
    }

    public void setDataContrata(Calendar dataContrata) {
        this.dataContrata = dataContrata;
    }

    public int getQtdParcelas() {
        return qtdParcelas;
    }

    public void setQtdParcelas(int qtdParcelas) {
        this.qtdParcelas = qtdParcelas;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.id;
        hash = 71 * hash + Objects.hashCode(this.cliente);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.valor) ^ (Double.doubleToLongBits(this.valor) >>> 32));
        hash = 71 * hash + Objects.hashCode(this.dataContrata);
        hash = 71 * hash + this.qtdParcelas;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.taxa) ^ (Double.doubleToLongBits(this.taxa) >>> 32));
        hash = 71 * hash + Objects.hashCode(this.tipo);
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
        final Financiamento other = (Financiamento) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.valor) != Double.doubleToLongBits(other.valor)) {
            return false;
        }
        if (this.qtdParcelas != other.qtdParcelas) {
            return false;
        }
        if (Double.doubleToLongBits(this.taxa) != Double.doubleToLongBits(other.taxa)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        if (!Objects.equals(this.dataContrata, other.dataContrata)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Financiamento{" + "id=" + id + ", cliente=" + cliente + ", valor=" + valor + ", dataContrata=" + dataContrata + ", qtdParcelas=" + qtdParcelas + ", taxa=" + taxa + ", tipo=" + tipo + '}';
    }

    
}
