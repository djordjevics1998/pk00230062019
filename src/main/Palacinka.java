package main;

import java.util.ArrayList;

public class Palacinka {
	public enum Premaz { EUROKREM, DZEM }
	private Premaz premaz;
	private final ArrayList<Prilog> prilozi = new ArrayList<>();
	
	public Palacinka(Premaz premaz) {
		this.premaz = premaz;
	}
	
	public void dodajPrilog(Prilog p) throws GSastojak {
		for(int l = 0; l < prilozi.size(); l++)
			if(prilozi.get(l).equals(p)) throw new GSastojak("Ne možete dodati isti prilog dvaput!");
		
		prilozi.add(p);
	}
	
	public int getCena() {
		int cena = premaz == Premaz.EUROKREM ? 100 : 70;
		
		for(int l = 0; l < prilozi.size(); l++) cena += prilozi.get(l).getCena();
		
		return cena;
	}
	
	@Override
	public String toString() {
		String opis = premaz == Premaz.EUROKREM ? "Eurokrem" : "Dzem";
		
		for(int l = 0; l < prilozi.size(); l++) opis += ", " + prilozi.get(l).imeSastojka();
		
		return opis;
	}
}
