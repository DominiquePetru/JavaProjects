package campeonat;

public class Cotxe {

	//ATRIBUTS
	private int potencia;
	private int velocitat;
	private String color;
	private int preu;
	
	//CONSTRUCTOR
	public Cotxe(int potencia,int velocitat,String color,int preu) {
		this.potencia = potencia;
		this.velocitat = velocitat;
		this.color = color;
		this.preu = preu;
	}
	
	//GETTERS
	public int getPotencia(){
		return this.potencia;
	}
	public int getVelocitat(){
		return this.velocitat;
	}
	public String getColor(){
		return this.color;
	}
	public int getPreu(){
		return this.preu;
	}
	//metode que aprofitem en la escuderia per mostrar dades del ArrayList cotxes
	public void getDades() {
		System.out.println("· Cotxe de "+ getPotencia() + 
				" CV, color " + getColor() + ", velocitat màxima " + 
				getVelocitat() + " km/h i preu " + getPreu() + " euros.");	
	}
	
	//SETTERS
	public void setPotencia(int potencia){
		this.potencia = potencia;
	}
	public void setVelocitat(int velocitat){
		this.velocitat = velocitat;
	}
	public void setColor(String color){
		this.color = color;
	}
	public void setPreu(int preu){
		this.preu = preu;
	}
	
	
}
