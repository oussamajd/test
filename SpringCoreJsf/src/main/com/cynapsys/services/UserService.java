package main.com.cynapsys.services;



import java.util.List;

import main.com.cynapsys.entities.User;

public interface UserService  extends AbstractService<User> {

public User findById(Integer id);
	
public User findByUsername(String username) ;

public Object save(User entity);

public void update(User entity) ;

public boolean delete(User entity) throws Exception ;

public List<User> findAll() ;


	
	
}
