package main;

public class Prilog {
	public enum Sastojak { PLAZMA, KIKIRIKI, KOKOS, ORASI }
	private Sastojak sastojak;
	private int cena;
	
	public Prilog(Sastojak sastojak, int cena) {
		this.sastojak = sastojak;
		this.cena = cena;
	}
	
	public Sastojak getSastojak() { return sastojak; }
	
	public int getCena() { return cena; }
	
	public boolean equals(Prilog p) {
		return this.sastojak == p.sastojak;
	}
	
	public String imeSastojka() {
		switch(sastojak) {
		case PLAZMA:
			return "plazma";
		case KIKIRIKI:
			return "kikiriki";
		case KOKOS:
			return "kokos";
			default:
				return "orasi";
		}
	}
}