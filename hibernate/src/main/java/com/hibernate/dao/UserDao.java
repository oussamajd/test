
package com.hibernate.dao;

import java.util.List;

import com.hibernate.entity.user;

public interface UserDao  {
		
		public Integer searchforid(user user);
		
		public user findById(int id);
		 
		 public void adduser(user user);
		 
		 public void deleteuser(int id); 
		 
		 public user updateuser(user user);
		 
		 public List<user> userslist();

		 


}
