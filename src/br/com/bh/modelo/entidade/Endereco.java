
package br.com.bh.modelo.entidade;

public class Endereco {
    private int id;
    private String uf;
    private String cidade;
    private String bairro;
    private String cep;
    private String complemento;

    public Endereco() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Endereco(String uf, String cidade, String bairro, String cep, String complemento) {
        this.uf = uf;
        this.cidade = cidade;
        this.bairro = bairro;
        this.cep = cep;
        this.complemento = complemento;
    }
    
    

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    
}
