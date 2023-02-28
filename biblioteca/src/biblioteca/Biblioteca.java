package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
	
	private ArrayList<Libri> libri = new ArrayList<>();
	
	public Biblioteca() {
		
	}
	
	public void prendiLibro(String gg) {
		libri.forEach(libro-> libro.ricerca(gg));
	}
	
	public void addLibro(String titolo, String autore, String annodipubblicazione,String casaeditrice,int copiedisponibili) {
		
		libri.add(new Libri(titolo,autore,annodipubblicazione,casaeditrice,copiedisponibili));
		
	}
	
	public void RemoveLibro(String Titolo) {
		int cont=0;
		
		while(cont<libri.size())
		 { int indice=cont+1;Libri Libro =libri.get(cont);
		 String titolo = Libro.getTitolo();
		 String autore= Libro.getAutore();
		 String annodiProduzione=Libro.getAnnoPubblicazione();
		 String casaEditrice=Libro.getCasaEditrice();
		 if( Titolo == titolo || autore== Titolo || casaEditrice==Titolo || annodiProduzione==Titolo )
		 { System.out.println("Libro da cancellare "+indice);
			 libri.remove(cont);
		 System.out.println("Libro eliminato");} cont++;
		 }
	}
	
}
