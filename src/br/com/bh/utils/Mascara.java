
package br.com.bh.utils;

import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;
import java.text.NumberFormat;


public class Mascara {

    public Mascara() {
    }
    
 
       public MaskFormatter maskData(JFormattedTextField textfield) throws ParseException{
        MaskFormatter mask = null;
        mask = new MaskFormatter("##/##/####");
        mask.setOverwriteMode(true);
        mask.setValidCharacters("0123456789");
        mask.setPlaceholderCharacter('_');
        mask.install(textfield);
        return mask;
    }
      public MaskFormatter maskCep(JFormattedTextField textfield) throws ParseException{
        MaskFormatter mask = null;
        mask = new MaskFormatter("##.###-###");
        mask.setOverwriteMode(true);
        mask.setValidCharacters("0123456789");
        mask.setPlaceholderCharacter('_');
        mask.install(textfield);
        return mask;   
}
      
         public MaskFormatter maskTel(JFormattedTextField textfield) throws ParseException{
        MaskFormatter mask = null;
        mask = new MaskFormatter("(##)####-#####");
        mask.setOverwriteMode(true);
        mask.setValidCharacters("0123456789");
        mask.setPlaceholderCharacter('_');
        mask.install(textfield);
        return mask;   
}
         public Double moneyToDouble(String numero){
            String s = numero.replace("R\\$", "");
            s = s.replaceAll("$", "");
            s = s.replaceAll(".", "");
            s = s.replaceAll(",", ".");
      //      double d = Double.parseDouble(numero.replaceAll("R$", "").replaceAll(",", "."));
             
             
           return null;

}
         
        
    }
}