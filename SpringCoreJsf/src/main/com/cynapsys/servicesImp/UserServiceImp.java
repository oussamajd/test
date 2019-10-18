package main.com.cynapsys.servicesImp;

import java.io.Serializable;
import java.util.List;

import main.com.cynapsys.DAO.UserDao;
import main.com.cynapsys.entities.User;
import main.com.cynapsys.services.UserService;

public class UserServiceImp  implements UserService ,Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserDao userdao;

	@Override
	public User findById(Integer id) {
		return userdao.findById(id);
		// TODO Auto-generated method stub
	}

	@Override
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return userdao.findByUsername(username);
	}

	@Override
	public Object save(User entity) {
		// TODO Auto-generated method stub;
		userdao.save(entity);
		return null;
	}

	@Override
	public void update(User entity) {
		// TODO Auto-generated method stub
		userdao.update(entity);
	}

	@Override
	public boolean delete(User entity) throws Exception {
		// TODO Auto-generated method stub
		return userdao.delete(entity);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return  userdao.findAll();
	}
	
}
