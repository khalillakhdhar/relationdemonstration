package com.hb.manytoone;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Categorie {
@Id
private int id;
@Column(unique = true)
private String categorie;
//  optionelle
@OneToMany(mappedBy = "categorie")
Set<Produit> products=new HashSet<Produit>();




public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCategorie() {
	return categorie;
}
public void setCategorie(String categorie) {
	this.categorie = categorie;
}

}
