package biblioteca;

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
	}

}
