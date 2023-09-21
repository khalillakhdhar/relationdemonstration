package com.hb.model.inheritance;

import jakarta.persistence.Entity;

@Entity
public class Lyceen extends Etudiant {
	private String lycee;
	private int niveau;
	public String getLycee() {
		return lycee;
	}
	public void setLycee(String lycee) {
		this.lycee = lycee;
	}
	public int getNiveau() {
		return niveau;
	}
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	

}
