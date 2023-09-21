package com.hb.model.inheritance;

import jakarta.persistence.Entity;

@Entity
public class Ouvrier extends Employee {
	private String fonction;
	private int soldeConge;
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	public int getSoldeConge() {
		return soldeConge;
	}
	public void setSoldeConge(int soldeConge) {
		this.soldeConge = soldeConge;
	}
	

}
