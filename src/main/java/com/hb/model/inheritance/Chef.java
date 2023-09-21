package com.hb.model.inheritance;

import jakarta.persistence.Entity;

@Entity
public class Chef extends Employee {
	private String secteur;

	public String getSecteur() {
		return secteur;
	}

	public void setSecteur(String secteur) {
		this.secteur = secteur;
	}

}
