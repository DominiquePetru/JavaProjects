package campeonat;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacio {

	static ArrayList <Escuderia> escuderies = new ArrayList <Escuderia>();
	static Scanner entrada = new Scanner (System.in);
	
	//MAIN
	public static void main(String[] args) {
		
		//VARIABLES
		int accio = 1;
		
		//MENU PRINCIPAL
		while(accio != 0){
			System.out.println("Benvingut al gestor del campionat. Que desitges fer?");
			
			System.out.println("· 0: Sortir");
			System.out.println("· 1: Afegir escuderia");
			System.out.println("· 2: Afegir cotxes, treballadors o modificar escuderia");
			System.out.println("· 3: Mostrar escuderia");
			System.out.println("· 4: Eliminar escuderia");
			
			accio = entrada.nextInt();
			
			if(accio == 1) {
				afegirEscuderia();
				}
		
			else if(accio == 2) {
				modificarEscuderia();
				}
		
			else if(accio == 3) {
				mostrarEscuderia();	
				}
			
			else if(accio == 4) {
				eliminarEscuderia();	
				}
			
			else if(accio > 4) {
				System.out.println("No has introduït el nombre de l'opció correctament.");	
				}
			else if(accio == 0) {
				System.out.println("Gràcies per utilitzar el gestor del campeonat. Fins a la propera!");	
				}
			}
		}
	//METODES PRINCIPALS
	public static void afegirEscuderia(){
		
		String nom = " ";
		int pressupost = 0;
		String pais = " ";
		
		System.out.println("Indica el nom de l'escuderia.");
		nom = entrada.next();
		System.out.println("Indica el pressupost de l'escuderia.");
		pressupost = entrada.nextInt();
		System.out.println("Indica el pais de orígen de l'escuderia.");
		pais = entrada.next();
		
		escuderies.add(new Escuderia (nom, pressupost, pais));
		System.out.println("La escuderia " + nom + " s'ha afegit correctament.");
		System.out.println();
	}
	
	public static void modificarEscuderia(){
		
		String nomEscuderia= " ";
		int accio = 1;
		
		if (escuderies.size() > 0) {
			System.out.println("Quina escuderia vols gestionar?");
			getNomEscuderia();

			nomEscuderia = entrada.next();	
			Escuderia escuderia = getEscuderia(nomEscuderia);
			
			
			while(accio != 0){
				
				System.out.println("Que vols fer?");
				System.out.println("· 0: Sortir");
				System.out.println("· 1: Afegir cotxe");
				System.out.println("· 2: Eliminar cotxe");
				System.out.println("· 3: Afegir un membre de l'equip");
				System.out.println("· 4: Donar de baixa un membre de l'equip");
					
				accio = entrada.nextInt();
				
				switch(accio) {
					case 1:
						escuderia.addCotxe();
						break;
					case 2:
						escuderia.eliminarCotxe();
						break;
					case 3:
						escuderia.addTreballador();
						break;
					case 4:
						escuderia.eliminarTreballador();
						break;
					default:
						System.out.println();
				}	
			}	
		}
	}
	
	public static void mostrarEscuderia(){
		
		String nomEscuderia= " ";
		
		if (escuderies.size() > 0) {
			System.out.println("Quina escuderia vols veure?");
			getNomEscuderia();
			nomEscuderia = entrada.next();
			
			Escuderia escuderia = getEscuderia(nomEscuderia);
			escuderia.mostrarDades();
		}
		else {
			System.out.println("No hi ha cap escuderia dins de l'aplicació.");
		}
			
	}
	
	public static void eliminarEscuderia(){
		
		String nomEscuderia= " ";
		
		if (escuderies.size() > 0) {
			System.out.println("Quina escuderia vols eliminar?");
			getNomEscuderia();
			nomEscuderia = entrada.next();
			
			Escuderia escuderia = getEscuderia(nomEscuderia);
			System.out.println("L'escuderia " + escuderia.getNom() + " serà eliminada.");
			escuderies.remove(escuderia);	
		}
		else {
			System.out.println("No hi ha cap escuderia dins de l'aplicació.");
		}
	}
	
	//METODES D'AJUDA PELS METODES PRINCIPALS
	public static Escuderia getEscuderia(String nomEscuderia){
		for (Escuderia escuderia : escuderies){
			if(escuderia.getNom().equals(nomEscuderia)){
				return escuderia;
			}
		}
		System.out.println("No hi ha cap escuderia amb aquest nom.");	
		return null;
	}
	
	public static void getNomEscuderia(){
		for (Escuderia nom : escuderies){
			System.out.println(nom.getNom());
			}
		}
	}