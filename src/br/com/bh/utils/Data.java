

package br.com.bh.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Data {
    	public static Date formataData(String data) throws Exception { 
		if (data == null || data.equals(""))
			return null;
        Date date = null;
        try {
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            date = (java.util.Date)formatter.parse(data);
        } catch (ParseException e) {            
            throw e;
        }
        return date;
	}
    	/**
 	 * Converte uma String para um objeto Date. Caso a String seja vazia ou nula, 
 	 * retorna null - para facilitar em casos onde formulários podem ter campos
 	 * de datas vazios.
 	 * @param data String no formato dd/MM/yyyy a ser formatada
 	 * @return Date Objeto Date ou null caso receba uma String vazia ou nula
 	 * @throws Exception Caso a String esteja no formato errado
 	 */
 	public static java.sql.Date formataDataSql(String data) throws Exception { 
 		if (data == null || data.equals(""))
 			return null;
         java.sql.Date date = null;
         try {
             DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
             date = new java.sql.Date( ((java.util.Date)formatter.parse(data)).getTime() );
         } catch (ParseException e) {            
             throw e;
         }
         return date;
 	}
        
        	public static Calendar converteCalendar(String sData){
                Calendar data = new GregorianCalendar();
		//data = null;
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
		try {
			data.setTime(sd.parse(sData));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return data;
	}
      	public  static Calendar getPegaDataAtual(){
		Calendar calendar = new GregorianCalendar();
		Date trialTime = new Date();
		calendar.setTime(trialTime);
                return  calendar;
	}          
}
