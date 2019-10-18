package main.com.cynapsys.DAOImp;



import java.io.Serializable;
import java.util.List;




import main.com.cynapsys.DAO.AbstractDao;

import  org.springframework.orm.hibernate5.support.*;




public class AbstractDAOImpl<T> extends HibernateDaoSupport implements AbstractDao<T>,Serializable{

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private Class<T> entityClass;

		public AbstractDAOImpl(Class<T> entityClass) {
			this.entityClass = entityClass;
}



@Override
public Object save(T entity) {
    this.getHibernateTemplate().save(entity);
    return null ;
}


@Override
public void update(T entity) {
    this.getHibernateTemplate().update(entity);
}



@Override
public List<T> findAll() {
    return this.getHibernateTemplate().loadAll(entityClass);
}




@Override
public boolean delete(T entitys) throws Exception {        
        this.getHibernateTemplate().delete(entitys);
    
    return true;
}



@Override
public T find(Object idClass) {
	// TODO Auto-generated method stub
  return (T) this.getHibernateTemplate().get(entityClass,(Serializable) idClass);
}


}

