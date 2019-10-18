package main.com.cynapsys.services;

import java.util.List;

 

public interface AbstractService<T> {

 
	public Object save(T entity);

    public void update(T entity);

    public boolean delete(T entity) throws Exception ;
    
    public List<T> findAll();    

 
 

}
 