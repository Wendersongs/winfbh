
package br.com.bh.modelo.entidade;

import java.util.Date;
import java.util.Objects;


public class Parcela {
    private long id;
    private int numeroParcela;
    private double valor;
    private Date data;
    private Financiamento financiamento;

    public Parcela() {
    }

    public Parcela(long id) {
        this.id = id;
    }

    public Parcela(int numeroParcela, double valor, Date data, Financiamento financiamento) {
        this.numeroParcela = numeroParcela;
        this.valor = valor;
        this.data = data;
        this.financiamento = financiamento;
    }
    
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumeroParcela() {
        return numeroParcela;
    }

    public void setNumeroParcela(int numeroParcela) {
        this.numeroParcela = numeroParcela;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Financiamento getFinanciamento() {
        return financiamento;
    }

    public void setFinanciamento(Financiamento financiamento) {
        this.financiamento = financiamento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 53 * hash + this.numeroParcela;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.valor) ^ (Double.doubleToLongBits(this.valor) >>> 32));
        hash = 53 * hash + Objects.hashCode(this.data);
        hash = 53 * hash + Objects.hashCode(this.financiamento);
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
        final Parcela other = (Parcela) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.numeroParcela != other.numeroParcela) {
            return false;
        }
        if (Double.doubleToLongBits(this.valor) != Double.doubleToLongBits(other.valor)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (!Objects.equals(this.financiamento, other.financiamento)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Parcela{" + "id=" + id + ", numeroParcela=" + numeroParcela + ", valor=" + valor + ", data=" + data + ", financiamento=" + financiamento + '}';
    }

   
}
