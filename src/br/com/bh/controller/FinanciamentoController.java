
package br.com.bh.controller;

import br.com.bh.modelo.dao.ClienteDAO;
import java.sql.SQLException;
import java.text.DecimalFormat;


public class FinanciamentoController {
    
    
    public double calculaMargem(double salario){
        double margem = 0;
        margem = salario * 0.3;
        
        
        return margem;
    
    }
    public Double calculaMargemAtual(int idCliente) throws SQLException{
        Double margemAtual = 0.0;
        Double dividas = 0.0;
        ClienteDAO c  = new ClienteDAO();
        dividas = c.buscaDividas(idCliente);
        
        
        return margemAtual;
    
    
    }
    public double calculaJuro( double valor, double taxa){
        taxa = taxa/100;
        
        
        return valor*taxa;
    
    
    }
    
    public double calculaTotalPrice (double parcela, int periodo){
        
        
        
        
        return parcela*periodo;
        
    }
    public double calculaPrestacaoPrice( double valorPresente,double taxa, int periodo){
        double parcela=0;
       taxa=taxa/100;
       parcela=valorPresente*((Math.pow((1+taxa), periodo)*taxa)/((Math.pow((1+taxa),periodo))-1));
       return parcela;
    
    }
    
    public double calculaSaldoDevedor(double valorAtual, double amortiza){
        return valorAtual-amortiza;
       
    }
    
    public double calculaAmortiza(double parcela,double juros){
        
        
        
        return parcela-juros;
       
    }
    public double calculaSaldo(double saldoAtual, double amortiza){
        return saldoAtual-amortiza;
        
    }
    public String formataNumero (double d){
        
    DecimalFormat df = new DecimalFormat("#.00");
    return df.format(d);
    }
    
    public String substituiCaractere(String valor,String caractereAntigo, String caractereNovo){
        valor=valor.replaceAll(caractereAntigo, caractereNovo);
        
        return valor;
    
    }

}
