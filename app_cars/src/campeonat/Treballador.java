package campeonat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;


public class Treballador {

	//ATRIBUTS
	private String nom;
	private String cognom;
	private int edat;
	private Date alta;
	private int sou;
	public int id;
	public static int idSeguent = 1;
	
		
	//CONSTRUCTOR
	public Treballador(String nom,String cognom,int edat,int any, int mes, int dia) {
		
		this.nom = nom;
		this.cognom = cognom;
		this.edat = edat;
		GregorianCalendar calendari = new GregorianCalendar (any, (mes-1), dia);
		this.alta = calendari.getTime();
		this.sou = 50000;//salari base
		this.id = idSeguent;
		idSeguent ++;
	}
	
	//GETTERS
	public String getNom(){
		return this.nom;
	}
	public String getCognom(){
		return this.cognom;
	}
	public int getEdat(){
		return this.edat;
	}
	public String getAlta(){
		return new SimpleDateFormat("dd-MM-yyyy").format(this.alta);
	}
	public int getSou(){
		return this.sou;
	}
	//metode adicional per calcular la diferencia entre alta i data actual
	public int getDif() {
		
		Date date1 = new Date();
		Date date2 = this.alta;
		
		long date1InMs = date1.getTime();
		long date2InMs = date2.getTime();
		
		long timeDif = 0;
		if(date1InMs > date2InMs) {
			timeDif = date1InMs - date2InMs;
		} else {
			timeDif = date2InMs - date1InMs;
		}
		int yearsDif = (int) ((timeDif / (1000 * 60 * 60 * 24))/365);
	    return yearsDif;
	}
	
}
