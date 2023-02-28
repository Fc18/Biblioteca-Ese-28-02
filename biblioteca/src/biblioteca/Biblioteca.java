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
	
}
