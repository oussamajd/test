package com.hibernate.doaImp;

import java.util.List;


import org.hibernate.SessionFactory;

import com.hibernate.util.HibernateTemplate;


import com.hibernate.dao.UserDao;
import com.hibernate.entity.user;
import com.hibernate.util.*;



public class userDaoImp implements UserDao {
	private HibernateTemplate hibernateTemplate ;

	public userDaoImp() {
		this.hibernateTemplate = new HibernateTemplate();
		
	}
	
	@Override
	public user findById(Integer id) {
		// TODO Auto-generated method stub
		return (user) this.hibernateTemplate.findById(id, user.class);
	}



	public void adduser(user user) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.save(user);
		
	}
	
	public void deleteuser(Integer id) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.delete(id,user.class);
	}

	public user updateuser(user user) {
		// TODO Auto-generated method stub
		return this.updateuser(user);
	}
	@SuppressWarnings("unchecked")

	public List<user> userslist() {
		// TODO Auto-generated method stub
		return (List<user>) this.hibernateTemplate.findAll(user.class);
	
}
}
