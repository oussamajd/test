package com.hibernate.util;

import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;


public class HibernateUtil {

	
	
	private static SessionFactory sessionfactory;
	
	
	
	public static SessionFactory getSessionFactory() {
		if (sessionfactory == null) {
			sessionfactory =new Configuration().configure().buildSessionFactory();
			
		}
		return sessionfactory;
	}
	
		
	}

