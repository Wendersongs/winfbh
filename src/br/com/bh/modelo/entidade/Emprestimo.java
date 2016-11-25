
package br.com.bh.modelo.entidade;

import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Emprestimo {
    
    private int id;
    private Cliente cliente;
    private double valor;
    private Calendar data_atual; 
    private double taxa;
    private int prestacoes;
    
}
