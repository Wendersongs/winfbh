
package br.com.bh.modelo.entidade;

import java.util.Objects;
import java.util.Calendar;
import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;


public class Cliente   {
    private long id;
    private String nome;
    private String rg;
    private SexoType sexo;
    private Endereco endereco;
    private String cpf;
    private Contato contato;
    private Calendar data_nascimento;
    private double salario;
    private double margem;
    private Emprestimo emprestimo;
    
    
    public static void main(String[] args) {
        
    }

    public Cliente(long id, String nome, String rg, SexoType sexo, Endereco endereco, String cpf, Contato contato) {
        this.id = id;
        this.nome = nome;
        this.rg = rg;
        this.sexo = sexo;
        this.endereco = endereco;
        this.cpf = cpf;
        this.contato = contato;
    }

    public Cliente(long id, String nome, String rg, SexoType sexo, String cpf) {
        this.id = id;
        this.nome = nome;
        this.rg = rg;
        this.sexo = sexo;
        this.cpf = cpf;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public SexoType getSexo() {
        return sexo;
    }

    public void setSexo(SexoType sexo) {
        this.sexo = sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.rg);
        hash = 97 * hash + Objects.hashCode(this.sexo);
        hash = 97 * hash + Objects.hashCode(this.cpf);
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
        final Cliente other = (Cliente) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.rg, other.rg)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (this.sexo != other.sexo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", rg=" + rg + ", sexo=" + sexo + ", endereco=" + endereco + ", cpf=" + cpf + ", contato=" + contato + '}';
    }
    
    
    
}
