
package br.com.bh.modelo.entidade;


public enum SexoType {
  M ("Masculino")
  ,F ("Feminino");
  private String description;

    private SexoType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
  
}
