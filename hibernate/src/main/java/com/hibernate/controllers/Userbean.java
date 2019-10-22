package com.hibernate.controllers;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "userBean", eager = true)
public class Userbean {
	
	private String message="Hello World";
	
   public Userbean() {
      System.out.println("HelloWorld started!");
   }
	
   public String getMessage() {
      return message;
   }
}