
package main.com.cynapsys.controllers;

import java.io.Serializable;
import java.util.List;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import javax.servlet.http.HttpSession;


import main.com.cynapsys.entities.User;
import main.com.cynapsys.services.UserService;



@ManagedBean(name = "UserBean")
@ViewScoped
public class UserBean implements Serializable {
	
	private UserService UserService;
	
	private static final long serialVersionUID = 1L;
	private User user;
	
	private String password;
	
	private List<User> users;
	
	private HttpSession session;
	
	public UserBean() {
		
	}
	
	}

