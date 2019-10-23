package com.hibernate.servicesImp;

import java.io.Serializable;
import java.util.List;

import com.hibernate.doaImp.userDaoImp;
import com.hibernate.entity.user;
import com.hibernate.services.UserService;

public class UserServiceImp  implements UserService ,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7516400035542709370L;
	
	private userDaoImp userdao;	
	
	public UserServiceImp() {
		userdao= new userDaoImp();
	}
	
	


	public user findById(int id) {
		// TODO Auto-generated method stub
		return userdao.findById(id);
	}



	public void adduser(user user) {
		// TODO Auto-generated method stub
		userdao.adduser(user);
		System.out.println("user added");
	}

	public void deleteuser(int id) {
		// TODO Auto-generated method stub
		userdao.deleteuser(id);
		System.out.println("user deleted");
	}

	public user updateuser(user user) {
		// TODO Auto-generated method stub
		return userdao.updateuser(user);
		
	}


	public List<user> userslist() {
		// TODO Auto-generated method stub
		return userdao.userslist();
	}




	public List<user> findByUsername(String Username) {
		// TODO Auto-generated method stub
		return null;
	}




	public Integer searchforid(user user) {
		// TODO Auto-generated method stub
		return userdao.searchforid(user);
	}
		
}
