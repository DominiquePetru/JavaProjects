package campeonat;

import java.util.ArrayList;
import java.util.Scanner;

public class Escuderia{

static Scanner entrada = new Scanner (System.in);

	//ATRIBUTS
	private String nom;
	private int pressupost;
	private String pais;
	private ArrayList <Cotxe> cotxes;
	private ArrayList <Piloto> pilotos;
	private ArrayList <Mecanic> mecanics;
	
	//CONSTRUCTOR
	public Escuderia(String nom,int pressupost, String pais){
		
		this.nom = nom;
		this.pressupost = pressupost;
		this.pais = pais;
		this.cotxes = new ArrayList <Cotxe>();
		this.pilotos = new ArrayList <Piloto>();
		this.mecanics = new ArrayList <Mecanic>();
		
	}
	//GETTERS
	public String getNom(){
		return this.nom;
	}
	public int getPressupost(){
		return this.pressupost;
	}
	public String getPais(){
		return this.pais;
	}
	
	//SETTERS
	public void setNom(String nom){
		this.nom = nom;
	}
	public void setPressupost(int pressupost){
		this.pressupost = pressupost;
	}
	public void setPais(String pais){
		this.pais = pais;
	}
	
	//ALTRES METODES
	public void addCotxe(){
		int potencia;
		int velocitat;
		String color;
		int preu;
		
		System.out.println("Indica la potencia del cotxe: ");
		potencia = entrada.nextInt();
		System.out.println("Indica la velocitat màxima del cotxe: ");
		velocitat = entrada.nextInt();
		System.out.println("Indica el color del cotxe: ");
		color = entrada.next();
		System.out.println("Indica el preu del cotxe: ");
		preu = entrada.nextInt();
		
		Cotxe cotxeNou = new Cotxe(potencia,velocitat,color,preu);
		cotxes.add(cotxeNou);
		System.out.println();	
	}
	
	public void eliminarCotxe(){
		int index = 0;
		
		System.out.println("Quin cotxe vols eliminar: ");
		
		for (int i = 0; i < cotxes.size(); i++ ) {
			System.out.print("· " + (i+1) + ": ");
			cotxes.get(i).getDades();
			}
		index = entrada.nextInt();
		index = index-1;
		
		System.out.println("El cotxe serà eliminat.");
		cotxes.remove(index);
		
	}

	public void addTreballador(){
		
		String nomTreballador = "";
		String cognomTreballador = "";
		int edatTreballador = 0;
		int any = 0;
		int mes = 0;
		int dia = 0;
		int pes = 0;
		double alcada;
		String estudis = "";
		int tipusTreballador = 1;
		
		while(tipusTreballador != 0){
			
			System.out.println("Quin tipus de treballador vols afegir? ");
			System.out.println("· 0: Sortir");
			System.out.println("· 1: Piloto");
			System.out.println("· 2: Mecànic");
			
			tipusTreballador = entrada.nextInt();
			
			
			if(tipusTreballador == 1 || tipusTreballador == 2 ) {
				
				System.out.println("Undica el nom. ");
				nomTreballador = entrada.next();
				System.out.println("Undica el cognom. ");
				cognomTreballador = entrada.next();
				System.out.println("Undica l'edat. ");
				edatTreballador = entrada.nextInt();
				System.out.println("Undica l'any d'alta.");
				any = entrada.nextInt();
				System.out.println("Undica el mes d'alta.");
				mes = entrada.nextInt();
				System.out.println("Undica el dia d'alta.");
				dia = entrada.nextInt();
				
				}
		
			if(tipusTreballador == 1) {
				
				System.out.println("Quina és la seva alçada? ");
				alcada = entrada.nextDouble();
				System.out.println("Quin és el seu pes? ");
				pes = entrada.nextInt();
				
				Piloto pilotoNou = new Piloto(nomTreballador,cognomTreballador,edatTreballador,any,mes,dia,alcada,pes);
				pilotos.add(pilotoNou);
				System.out.println("S'ha afegit un nou piloto " + pilotoNou.getNom() + ".");
				}
			
			else if(tipusTreballador == 2) {
				
				System.out.println("Té estudis superiors de mecànica? si o no? ");
				estudis = entrada.next();
				
				Mecanic mecanicNou = new Mecanic(nomTreballador,cognomTreballador,edatTreballador,any,mes,dia,estudis);
				mecanics.add(mecanicNou);
				System.out.println("S'ha afegit un nou mecànic " + mecanicNou.getNom() + ".");
				}
			}
		}
	
	public void eliminarTreballador(){
		
		int tipusTreballador = 1;
		int id;
		
		while(tipusTreballador != 0){
			
			System.out.println("Quin tipus de treballador vols donar de baixa? ");
			System.out.println("· 0: Sortir");
			System.out.println("· 1: Piloto");
			System.out.println("· 2: Mecànic");
			
			tipusTreballador = entrada.nextInt();
	
			if(tipusTreballador == 1) {
				System.out.println("Marca el id del treballador.");
				
				for (int i = 0; i < pilotos.size(); i++ ) {
					System.out.print("· " + (i+1) + ": ");
					pilotos.get(i).getDades();
					}
				
				id = entrada.nextInt();
				id = id-1;
				
				System.out.println("El piloto " + pilotos.get(id).getNom() + " serà eliminat de l'escuderia.");
				pilotos.remove(id);
				
			}
			else if(tipusTreballador == 2) {
				System.out.println("Marca el id del treballador.");
				
				for (int i = 0; i < mecanics.size(); i++ ) {
					System.out.print("· " + (i+1) + ": ");
					mecanics.get(i).getDades();
					}
				
				id = entrada.nextInt();
				id = id-1;
				
				System.out.println("El mecànic " + mecanics.get(id).getNom() + " serà eliminat de l'escuderia.");
				mecanics.remove(id);	
			}
		}
	}
	
	//METODES D'AJUDA
	public void mostrarDades(){
		System.out.println("El nom de l'escuderia és " + this.nom + ", i prové de " + this.pais + ". El seu pressupost és " + this.pressupost + " euros.");
		System.out.println("Actualment disposa d'aquests cotxes: ");
		this.mostrarCotxes();
		System.out.println("El seu equip de pilots está format per: ");
		this.mostrarPilotos();
		System.out.println("El seu equip de mecànics está format per: ");
		this.mostrarMecanics();
		System.out.println();
	}
	
	public void mostrarCotxes(){
		
		for (int i = 0; i < cotxes.size(); i++ ) {
			cotxes.get(i).getDades();
			}
	}

	public void mostrarPilotos(){
		
		for (int i = 0; i < pilotos.size(); i++ ) {
			pilotos.get(i).getDades();
			}
	}
	
	public void mostrarMecanics(){
		
		for (int i = 0; i < mecanics.size(); i++ ) {
			mecanics.get(i).getDades();
			}
		}
}
