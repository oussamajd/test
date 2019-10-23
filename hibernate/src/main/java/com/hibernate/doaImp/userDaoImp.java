package com.hibernate.doaImp;

import java.util.List;




import com.hibernate.util.HibernateTemplate;


import com.hibernate.dao.UserDao;
import com.hibernate.entity.user;



public class userDaoImp implements UserDao {
	private HibernateTemplate hibernateTemplate ;

	public userDaoImp() {
		this.hibernateTemplate = new HibernateTemplate();
		
	}
	
	
	public user findById(int id) {
		// TODO Auto-generated method stub
		return (user) this.hibernateTemplate.findById(id, user.class);
	}



	public void adduser(user user) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.save(user);
		
	}
	
	public void deleteuser(int id) {
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


	public Integer searchforid(user user) {
		// TODO Auto-generated method stub
		StringBuilder queryString =new StringBuilder();
		queryString.append("select id from ");
		queryString.append(user.getClass().getName());
		queryString.append( " WHERE nom='");
		queryString.append(user.getNom()+"'");
		queryString.append( " and prenom ='"+user.getPrenom()+"'");
		
		return  (Integer) this.hibernateTemplate.getSessionFactory().openSession().createQuery(queryString.toString()).list().get(0);
	}
}
