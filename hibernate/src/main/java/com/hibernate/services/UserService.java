package com.hibernate.services;


import java.util.List;

import com.hibernate.dao.UserDao;
import com.hibernate.entity.user;

public interface UserService  extends UserDao {

public user findById(Integer id);
	

public List<user> findByUsername(String Username);


public void adduser(user user);


public void deleteuser(Integer id);


public user updateuser(user user);


public List<user> userslist();



	
}
