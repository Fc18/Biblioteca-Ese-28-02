package biblioteca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Biblioteca bb = new Biblioteca();
		bb.addLibro("Il Ritratto di Dorian Gray","Oscar Wilde","1890","Giulio Einaudi",100);
		bb.addLibro("Fontamara","Ignazio Silone","1933","Mondadori",150);
		bb.addLibro("Il Gattopardo","Giuseppe Tomasi di Lampedusa","1958","Feltrinelli",120);
		bb.addLibro("Così parlo Zarathustra","Friedrich Nietzsche","1883","Bocca",75);
		bb.addLibro("Parola di Giobbe","Giobbe Covatta","1991","Salani editore",20);
		bb.addLibro("1984","George Orwell","1949","Mondadori",90);
		
		if(bb.prendiLibro("Il Gattopardo")) System.out.println("Il titolo corrisponde correttamente.");
		
		
		Scanner scan= new Scanner(System.in);	
		System.out.println("Benvenuto in biblioteca");
		System.out.println("Vuoi leggere un libro? (y/n)");
		String titoloRic="";
		
		
		//aggiungere, cercare, visualizzare e rimuovere 
		String input= scan.nextLine();
		if (input.equals("y")) {
			System.out.println("Che libro vuoi leggere?");
			titoloRic= scan.nextLine();
			
			//metodo per trovare il libro
			prendiLibro(titoloRic);
						
			//metodo per leggere il libro
		}
		else if (input.equals("n")){
			System.out.println("non vuoi leggere");
			
			System.out.println("Vuoi aggiungere un libro?");
			 input= scan.nextLine();
			if (input.equals("y")) {
				System.out.println("Inserisci le informazioni");
				input= scan.nextLine();
				//metodo per trovare aggiungere un libro
				}
			else if(input.equals("n")) {
				System.out.println("non vuoi aggiungere un libro");
				
				System.out.println("Vuoi cancellare un libro?");
				 input= scan.nextLine();
				if (input.equals("y")) {
					System.out.println("Che libro vuoi cancellare?");
					input= scan.nextLine();
					
					//metodo per cancellare un libro
					RemoveLibro(titoloRic);
					
					}
				else if(input.equals("n")) {
					System.out.println("non vuoi cancellare un libro");
				}
				else {
					System.out.println("non hai risposto correttamente");
					//ritorna alla domanda
				}
			}
			else {
				System.out.println("non hai risposto correttamente");
				//ritorna alla domanda
			}
			
		} 
		else {
			System.out.println("non hai risposto correttamente");
			//ritorna alla domanda
		}
		
	}

	private static void RemoveLibro(String titoloRic) {
		// TODO Auto-generated method stub
		
	}

	private static void prendiLibro(String ricerca) {
		// TODO Auto-generated method stub
		
	}

}
