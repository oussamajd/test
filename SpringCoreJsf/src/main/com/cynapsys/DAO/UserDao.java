package main.com.cynapsys.DAO;



import main.com.cynapsys.entities.User;

public interface UserDao extends AbstractDao<User> {
	
	 public User findById(Integer id);
	 
	 public User findByUsername(String Username);
		    

	 


	

}

