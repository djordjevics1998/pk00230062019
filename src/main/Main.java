package main;

import main.Palacinka.Premaz;
import main.Prilog.Sastojak;

public class Main {

	public static void main(String[] args) {
		Prilog p1 = new Prilog(Sastojak.PLAZMA, 20),
				p2 = new Prilog(Sastojak.KIKIRIKI, 25),
				p3 = new Prilog(Sastojak.ORASI, 30);
		
		Palacinka pal = new Palacinka(Premaz.EUROKREM);
		try {
			pal.dodajPrilog(p1);
			pal.dodajPrilog(p2);
			pal.dodajPrilog(p3);
		} catch (GSastojak e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Palacinka sadrzi: " + pal.toString());
		System.out.println("Cena palacinke je: " + pal.getCena());
		
		Porudzbina por1 = new Porudzbina(),
				por2 = new Porudzbina();
		
		System.out.println(por1.getId());
		System.out.println(por2.getId());
	}

}
