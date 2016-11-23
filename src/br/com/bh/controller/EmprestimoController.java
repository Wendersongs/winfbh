
package br.com.bh.controller;

import java.text.DecimalFormat;


public class EmprestimoController {
    
    
    public double calculaMargem(double salario){
        double margem = 0;
        margem = salario * 0.3;
        
        
        return margem;
    
    }
    public double calculaJuro( double valor, int taxa){
        return 0;
    
    
    }
    
    public double calculaTotalPrice (double parcela, int periodo){
        
        
        
        
        return parcela*periodo;
        
    }
    public double calculaPrestacaoPrice(double entrada, double valorPresente,double taxa, int periodo){
        double parcela=0;
       valorPresente=valorPresente-entrada; 
       taxa=taxa/100;
       parcela=valorPresente*((Math.pow((1+taxa), periodo)*taxa)/((Math.pow((1+taxa),periodo))-1));
       return parcela;
    
    }
    
    public double calculaSaldoDevedor(double valorAtual, double amortiza){
        return valorAtual-amortiza;
       
    }
    
    
    
    public String formataNumero (double d){
        
    DecimalFormat df = new DecimalFormat("#.00");
    return df.format(d);
    }

}
