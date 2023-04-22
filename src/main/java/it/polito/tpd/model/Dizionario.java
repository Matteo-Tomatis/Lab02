package it.polito.tpd.model;

import java.util.*;

public class Dizionario {
	
	private List<Parola> dizionario;

	public Dizionario() {
		super();
		this.dizionario = new ArrayList<>();
	}

	public List<Parola> getDizionario() {
		return dizionario;
	}
	
	public String leggiParola(String s) {
		String[] parole = s.split(" ");
    	if(parole.length==1) {
    		return cercaParola(s).getParolaUmana() + ": " + cercaParola(s).getParolaAliena();
    	}
    	else {
    		if(controllaLettere(parole[0])==true & controllaLettere(parole[1])==true) {
    		Parola p = new Parola(parole[0], parole[1]);
    		dizionario.add(p);
    		return "Parola aggiunta correttamente";
    		}
    		else {
    			return "Input non valido";
    		}
    	}
	}

	public void setDizionario(List<Parola> dizionario) {
		this.dizionario = dizionario;
	}
	
	public Parola cercaParola(String s) {
		for (Parola p : dizionario) {
			if(p.getParolaUmana().equals(s))
				return p;
		}
		
		return null;
	}
	
	public boolean controllaLettere(String s) {
		char result[] = s.toCharArray();
		for (char c : result) {
			if(Character.isLetter(c)==false)
				return false;
		}
		return true;
	}


	
	
	
	
	

}
