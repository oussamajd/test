package com.hibernate.controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import com.hibernate.entity.user;
import com.hibernate.servicesImp.UserServiceImp;

@ManagedBean(name = "userBean", eager = true)
public class Userbean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private user user = new user(); 
	
	private UserServiceImp service = new UserServiceImp();
	
	private List<user> users = new ArrayList<user>();

	public user getUser() {
		return user;
	}

	public void setUser(user user) {
		this.user = user;
	}

	public List<user> getUsers() {
		return service.userslist();
	}

	public void setUsers(List<user> users) {
		this.users = users;
	}
	 
	public String ajouter() {
		service.adduser(this.user);
		this.user= new user();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "utilisateur ajouté avec succés.", ""));
	return "added";
	}
	
	public String supprimer(user user) {
		service.deleteuser(user.getId());
		this.user= new user();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "utilisateur supprimé avec succés.", ""));
	return "removed";
	}
}