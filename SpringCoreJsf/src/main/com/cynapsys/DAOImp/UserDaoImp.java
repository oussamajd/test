package main.com.cynapsys.DAOImp;




import java.io.Serializable;
import java.util.List;

import org.hibernate.Transaction;

import main.com.cynapsys.DAO.UserDao;
import main.com.cynapsys.entities.User;

@SuppressWarnings("serial")
public class UserDaoImp extends AbstractDAOImpl<User> implements UserDao,Serializable{

	


	public UserDaoImp() {
		super(User.class);
		// TODO Auto-generated constructor stub
	}
	
	Transaction transaction = null;
	/*
	@SuppressWarnings("unchecked")
	@Override
	public User findById(Integer id) {
		// TODO Auto-generated method stub
		StringBuilder req = new StringBuilder();
		req.append("from users ");
		req.append("where ID= ").append("'" + id + "'");
		List<User> list = (List<User>) this.getHibernateTemplate().find(
				req.toString());

		if (list != null && !list.isEmpty())
			return (User) list.get(0);
		else
		
		return null;
	}
	*/
/*
	@SuppressWarnings("unchecked")
	@Override
	public User findByUsername(String Username) {
		// TODO Auto-generated method stub
		StringBuilder req = new StringBuilder();
		req.append("from users ");
		req.append("where username= ").append("'" + Username + "'");
		List<User> list =  (List<User>) getHibernateTemplate().find(req.toString());

		if (list != null && !list.isEmpty())
			return (User) list.get(0);
		else
		return null;
	}
	
	


*/

	@Override
	public Object save(User entity) {
		// TODO Auto-generated method stub
		return super.save(entity);
	}

	@Override
	public void update(User entity) {
		// TODO Auto-generated method stub
		super.update(entity);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public boolean delete(User entitys) throws Exception {
		// TODO Auto-generated method stub
		return super.delete(entitys);
	}

	@Override
	public User find(Object idClass) {
		// TODO Auto-generated method stub
		return super.find(idClass);
	}

	
	
	
}


