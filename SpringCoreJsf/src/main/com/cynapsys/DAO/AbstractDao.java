package main.com.cynapsys.DAO;


import java.util.List;

public interface AbstractDao<T> {
	
	 public Object save(T entity);
	
	 public void update(T entity);

	 public boolean delete(T entity) throws Exception;

	 public List<T> findAll();

	 public T find(Object idClass);


}