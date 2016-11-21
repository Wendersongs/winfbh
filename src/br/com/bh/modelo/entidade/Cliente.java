
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
    private String sexo;
    private String endereco;
    private String cpf;
    private String telefone;
    private String celular;
    private Calendar data_nascimento;
    private double salario;
    private double margem;
    private String email;
    private String cep;
    private String ocupacao;
    private String informacoes;

    public Cliente(long id, String nome, String rg, String sexo, String endereco, String cpf, String telefone, String celular, Calendar data_nascimento, double salario, double margem, String email, String cep, String ocupacao, String informacoes) {
        this.id = id;
        this.nome = nome;
        this.rg = rg;
        this.sexo = sexo;
        this.endereco = endereco;
        this.cpf = cpf;
        this.telefone = telefone;
        this.celular = celular;
        this.data_nascimento = data_nascimento;
        this.salario = salario;
        this.margem = margem;
        this.email = email;
        this.cep = cep;
        this.ocupacao = ocupacao;
        this.informacoes = informacoes;
    }

    public Cliente(String nome, String rg, String sexo, String endereco, String cpf, String telefone, String celular, Calendar data_nascimento, double salario, double margem, String email, String cep, String ocupacao, String informacoes) {
        this.nome = nome;
        this.rg = rg;
        this.sexo = sexo;
        this.endereco = endereco;
        this.cpf = cpf;
        this.telefone = telefone;
        this.celular = celular;
        this.data_nascimento = data_nascimento;
        this.salario = salario;
        this.margem = margem;
        this.email = email;
        this.cep = cep;
        this.ocupacao = ocupacao;
        this.informacoes = informacoes;
    }

    public Cliente() {
    }

    public Cliente(String nome, String rg, String sexo, String endereco, String cpf, String telefone, String celular, double salario, double margem) {
        this.nome = nome;
        this.rg = rg;
        this.sexo = sexo;
        this.endereco = endereco;
        this.cpf = cpf;
        this.telefone = telefone;
        this.celular = celular;
        this.salario = salario;
        this.margem = margem;
    }

    public Cliente(long id) {
        this.id = id;
    }

    public Cliente(long id, String nome, String rg, String sexo, String endereco, String cpf, String telefone, String celular, double salario, double margem) {
        this.id = id;
        this.nome = nome;
        this.rg = rg;
        this.sexo = sexo;
        this.endereco = endereco;
        this.cpf = cpf;
        this.telefone = telefone;
        this.celular = celular;
        this.salario = salario;
        this.margem = margem;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public String getInformacoes() {
        return informacoes;
    }

    public void setInformacoes(String informacoes) {
        this.informacoes = informacoes;
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
        hash = 11 * hash + Objects.hashCode(this.telefone);
        hash = 11 * hash + Objects.hashCode(this.celular);
        hash = 11 * hash + Objects.hashCode(this.data_nascimento);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.salario) ^ (Double.doubleToLongBits(this.salario) >>> 32));
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.margem) ^ (Double.doubleToLongBits(this.margem) >>> 32));
        hash = 11 * hash + Objects.hashCode(this.email);
        hash = 11 * hash + Objects.hashCode(this.cep);
        hash = 11 * hash + Objects.hashCode(this.ocupacao);
        hash = 11 * hash + Objects.hashCode(this.informacoes);
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
        if (!Objects.equals(this.sexo, other.sexo)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.celular, other.celular)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.cep, other.cep)) {
            return false;
        }
        if (!Objects.equals(this.ocupacao, other.ocupacao)) {
            return false;
        }
        if (!Objects.equals(this.informacoes, other.informacoes)) {
            return false;
        }
        if (!Objects.equals(this.data_nascimento, other.data_nascimento)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", rg=" + rg + ", sexo=" + sexo + ", endereco=" + endereco + ", cpf=" + cpf + ", telefone=" + telefone + ", celular=" + celular + ", data_nascimento=" + data_nascimento + ", salario=" + salario + ", margem=" + margem + ", email=" + email + ", cep=" + cep + ", ocupacao=" + ocupacao + ", informacoes=" + informacoes + '}';
    }

  
   
   
    
  




    
}
