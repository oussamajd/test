package com.hibernate.controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.hibernate.entity.user;
import com.hibernate.servicesImp.UserServiceImp;

@ManagedBean(name = "userBean", eager = true)

public class Userbean implements Serializable {
	/**
	 * 
	 */
	public Userbean() {
		// TODO Auto-generated constructor stub
	}
	
	private static final long serialVersionUID = 1L;

	private user user = new user(); 
	
	private String nom;
	
	private String prenom;
	
	private UserServiceImp service = new UserServiceImp();


	public user getUser() {
		return user;
	}

	public void setUser() {
		this.user = new user(getNom(),getPrenom());
		user.toString();
	}

	public List<user> getUsers() {
		return service.userslist();
	}

	 
	public String ajouter(){
	
		service.adduser(user);
		this.user= new user();
		
	return "added";
	}
	
	public String supprimer(user user) {
		
		int id =service.searchforid(user);
		service.deleteuser(id);
		this.user= new user();

	return "removed";
	}

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
}