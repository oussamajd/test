
package com.hibernate.dao;

import java.util.List;

import com.hibernate.entity.user;

public interface UserDao  {
		
		 public user findById(Integer id);
		 
		 public void adduser(user user);
		 
		 public void deleteuser(Integer id); 
		 
		 public user updateuser(user user);
		 
		 public List<user> userslist();

		 


}
