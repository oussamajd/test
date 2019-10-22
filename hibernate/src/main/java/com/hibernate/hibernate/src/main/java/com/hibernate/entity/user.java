package com.hibernate.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="users")
public class user implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1172612929139523437L;
	
	

	@Column(name = "ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer  id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name = "nom")
	private String nom; 
	@Column(name = "prenom")
	private String prenom;
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public user(String nom, String prenom) {
		
		this.nom = nom;
		this.prenom = prenom;
	}
	public user() {
	
	}
	@Override
	public String toString() {
		return "user [ nom=" + nom + ", prenom=" + prenom + "]";
	} 
	


	
}
