package campeonat;

public class Piloto extends Treballador{
	
	//ATRIBUTS PROPIS
	private double alcada;
	private int pes;
	
	//CONSTRUCTOR
	public Piloto (String nom,String cognom,int edat,int any, int mes, int dia,double alcada,int pes) {
		super(nom,cognom,edat,any,mes,dia);
		this.alcada = alcada;
		this.pes = pes;	
	}

	public double getAlcada() {
		return this.alcada;
	}
	
	public int getPes() {
		return this.pes;
	}
	//sobreescribim aquest metone preque el sou es diferent per cada treballador
	public int getSou() {
		int souPiloto = super.getSou();
		return souPiloto + (getDif()*10000) + 50000;
	}
	//metode que aprofitem en la escuderia per mostrar dades del ArrayList cotxes
	public void getDades() {
		System.out.println("· Piloto "+ getNom() + " " + getCognom() + ", edat " + 
				getEdat() + " anys, alta " + getAlta() + ", sou actual " + getSou()+ 
				" euros, alçada " + alcada + " m i el seu pes és " + pes + " kg.");
	}
}
