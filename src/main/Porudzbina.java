package main;

public class Porudzbina {
	private static int nextId = 0;
	private int id;
	
	public Porudzbina() {
		id = nextId++;
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
