package biblioteca;

public class Libri {
	private String titolo;
	private String autore;
	private String annoPubblicazione;
	private String casaEditrice;
	private int numeroCopie;

	public Libri(String titolo, String autore, String annoPubblicazione, String casaEditrice, int numeroCopie) {
		this.titolo = titolo;
		this.autore = autore;
		this.annoPubblicazione = annoPubblicazione;
		this.casaEditrice = casaEditrice;
		this.numeroCopie = numeroCopie;
	}
	
	public void ricerca(String titolo) {
		if(this.titolo.equals(titolo)) System.out.println("Trovato");
	}
	
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getAnnoPubblicazione() {
		return annoPubblicazione;
	}

	public void setAnnoPubblicazione(String annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}

	public String getCasaEditrice() {
		return casaEditrice;
	}

	public void setCasaEditrice(String casaEditrice) {
		this.casaEditrice = casaEditrice;
	}

	public int getNumeroCopie() {
		return numeroCopie;
	}

	public void setNumeroCopie(int numeroCopie) {
		this.numeroCopie = numeroCopie;
	}

	
}
