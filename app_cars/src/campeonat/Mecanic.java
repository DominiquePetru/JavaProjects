package campeonat;

public class Mecanic extends Treballador{
	
	//ATRIBUTS PROPIS
		private String estudis;
		
	//CONSTRUCTOR
	public Mecanic (String nom,String cognom,int edat,int any, int mes, int dia, String estudis) {
		super(nom,cognom,edat,any,mes,dia);
		this.estudis = estudis;
	}
	
	public String getEstudis() {
		if(estudis.equals("si")) {
			return " té estudis superiors.";		
		}
		else {
			return " no té estudis superiors.";
		}
		
	}
	//sobreescribim aquest metone preque el sou es diferent per cada treballador
	public int getSou() {
		int souMecanic = super.getSou();
		return souMecanic + (getDif()*10000);
	}
	//metode que aprofitem en la escuderia per mostrar dades del ArrayList cotxes
	public void getDades() {
		System.out.println("· Mecànic "+ getNom() + " " + getCognom() + ", edat " + 
				getEdat() + " anys, alta " + getAlta() + ", sou actual " + getSou() + " euros," + getEstudis());	
	}
		
}
