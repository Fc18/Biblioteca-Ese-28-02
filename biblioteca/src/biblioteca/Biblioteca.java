package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
	
	private ArrayList<Libri> libri = new ArrayList<>();
	
	public Biblioteca() {
		
	}
	
	public void prendiLibro(String gg) {
		libri.forEach(libro-> libro.ricerca(gg));
	}
	
	public String addLibro() {
		
		libri.add(new Libri("P","P","P","p",1));
		return "Aggiunto";
	}
	
}
