package main;

import java.util.ArrayList;

public class Palacinka {
	public enum Premaz { EUROKREM, DZEM }
	private Premaz premaz;
	private final ArrayList<Prilog> prilozi = new ArrayList<>();
	
	public Palacinka(Premaz premaz) {
		this.premaz = premaz;
	}
	
	public void dodajPrilog(Prilog prilog) throws GSastojak {
		for(Prilog p : prilozi)
			if(p.equals(prilog)) throw new GSastojak("Ne možete dodati isti prilog dvaput!");
		
		prilozi.add(prilog);
	}
	
	public int getCena() {
		int cena = premaz == Premaz.EUROKREM ? 100 : 70;
		
		for(Prilog p : prilozi) cena += p.getCena();
		
		return cena;
	}
	
	@Override
	public String toString() {
		String opis = premaz == Premaz.EUROKREM ? "Eurokrem" : "Dzem";
		
		for(Prilog p : prilozi) opis += ", " + p.imeSastojka();
		
		return opis;
	}
}
