package it.polito.tdp.Lab01.model;

//import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class Parole {
	
	private List<String> parole; 
		
	public Parole() {
		parole= new LinkedList<String>();	//parole= new ArrayList<String>();
	}
	
	public void addParola(String p) { 
		parole.add(p);
	}
	
	public List<String> getElenco() {
		Collections.sort(parole);
		return parole;
	}	
	
	
	public void reset() {
		parole.clear();
	}
	
	public void removeParola(String parola) {
		parole.remove(parola);
	}

}