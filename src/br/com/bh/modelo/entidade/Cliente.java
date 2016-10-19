
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
    
    
  

    public Cliente(String nome, String rg, SexoType sexo, String cpf, double salario, double margem) {
        this.nome = nome;
        this.rg = rg;
        this.sexo = sexo;
        this.cpf = cpf;
        this.salario = salario;
        this.margem = margem;
        
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

    public Calendar getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Calendar data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getMargem() {
        return margem;
    }

    public void setMargem(double margem) {
        this.margem = margem;
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", rg=" + rg + ", sexo=" + sexo + ", endereco=" + endereco + ", cpf=" + cpf + ", contato=" + contato + ", data_nascimento=" + data_nascimento + ", salario=" + salario + ", margem=" + margem + ", emprestimo=" + emprestimo + '}';
    }

  
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 11 * hash + Objects.hashCode(this.nome);
        hash = 11 * hash + Objects.hashCode(this.rg);
        hash = 11 * hash + Objects.hashCode(this.sexo);
        hash = 11 * hash + Objects.hashCode(this.endereco);
        hash = 11 * hash + Objects.hashCode(this.cpf);
        hash = 11 * hash + Objects.hashCode(this.contato);
        hash = 11 * hash + Objects.hashCode(this.data_nascimento);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.salario) ^ (Double.doubleToLongBits(this.salario) >>> 32));
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.margem) ^ (Double.doubleToLongBits(this.margem) >>> 32));
        hash = 11 * hash + Objects.hashCode(this.emprestimo);
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
        if (Double.doubleToLongBits(this.salario) != Double.doubleToLongBits(other.salario)) {
            return false;
        }
        if (Double.doubleToLongBits(this.margem) != Double.doubleToLongBits(other.margem)) {
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
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.contato, other.contato)) {
            return false;
        }
        if (!Objects.equals(this.data_nascimento, other.data_nascimento)) {
            return false;
        }
        if (!Objects.equals(this.emprestimo, other.emprestimo)) {
            return false;
        }
        return true;
    }


    
}
