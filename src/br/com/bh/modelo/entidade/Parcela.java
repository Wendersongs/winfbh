
package br.com.bh.modelo.entidade;

import java.util.Date;
import java.util.Objects;


public class Parcela {
    private int id;
    private int numeroParcela;
    private double valor;
    private Date data;

    public Parcela(int id, int numeroParcela, double valor, Date data) {
        this.id = id;
        this.numeroParcela = numeroParcela;
        this.valor = valor;
        this.data = data;
    }

    public Parcela(int id) {
        this.id = id;
    }

    public Parcela(int numeroParcela, double valor, Date data) {
        this.numeroParcela = numeroParcela;
        this.valor = valor;
        this.data = data;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.id;
        hash = 61 * hash + this.numeroParcela;
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.valor) ^ (Double.doubleToLongBits(this.valor) >>> 32));
        hash = 61 * hash + Objects.hashCode(this.data);
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
        return true;
    }

    @Override
    public String toString() {
        return "Parcela{" + "id=" + id + ", numeroParcela=" + numeroParcela + ", valor=" + valor + ", data=" + data + '}';
    }
    
    
    
}
