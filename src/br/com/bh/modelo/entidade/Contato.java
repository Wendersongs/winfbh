
package br.com.bh.modelo.entidade;

import java.util.Objects;


public class Contato {
    
    private int id;
    private String email;
    private String celular;
    private String telefone; 

    public Contato() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.email);
        hash = 29 * hash + Objects.hashCode(this.celular);
        hash = 29 * hash + Objects.hashCode(this.telefone);
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
        final Contato other = (Contato) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.celular, other.celular)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        return true;
    }
    
    

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contato [id=").append(id).append(", email=")
				.append(email).append(", telefone=").append(telefone)
				.append(", celular=").append(celular).append("]");
		return builder.toString();
	}
       
    
       
    }
    
    
    

