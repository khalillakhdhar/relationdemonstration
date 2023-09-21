package com.hb.model.inheritance;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Etudiant extends Personne {
	private String etablissement;
	private double moyenne;
	public String getEtablissement() {
		return etablissement;
	}
	public void setEtablissement(String etablissement) {
		this.etablissement = etablissement;
	}
	public double getMoyenne() {
		return moyenne;
	}
	public void setMoyenne(double moyenne) {
		this.moyenne = moyenne;
	}
	
	
	
	

}
