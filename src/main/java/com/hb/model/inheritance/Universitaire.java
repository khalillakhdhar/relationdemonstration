package com.hb.model.inheritance;

import jakarta.persistence.Entity;

@Entity
public class Universitaire extends Etudiant {
	private String universite,specialite;

	public String getUniversite() {
		return universite;
	}

	public void setUniversite(String universite) {
		this.universite = universite;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	
	

}
