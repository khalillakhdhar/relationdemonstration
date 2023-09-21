package com.hb.model.inheritance;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Employee extends Personne {
	private String societe;
	private double salaire;
	public String getSociete() {
		return societe;
	}
	public void setSociete(String societe) {
		this.societe = societe;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	

}
