package main;

import java.util.ArrayList;

public class Porudzbina {
	private static int nextId = 0;
	private int id;
	private final ArrayList<Palacinka> palacinke = new ArrayList<>();
	
	public Porudzbina() {
		id = nextId++;
	}
	
	public int getId() {
		return id;
	}
	
	public void dodajPalacinku(Palacinka p) {
		palacinke.add(p);
	}
	
	public void Isprazni() {
		palacinke.clear();
		palacinke.trimToSize();
	}
	
	public int brojPalacinki() {
		return palacinke.size();
	}
	
	public int getCena() {
		int cena = 0;
		for(Palacinka p : palacinke) cena += p.getCena();
		return cena;
	}
	
	@Override
	public String toString() {
		String opis = "porudzbina_" + id + "(" + brojPalacinki() + "): ";
		for(Palacinka p : palacinke) opis += " [" + p.toString() + "]";
		return opis;
	}
}
