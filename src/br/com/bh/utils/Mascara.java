
package br.com.bh.utils;

import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;


public class Mascara {
 
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
}