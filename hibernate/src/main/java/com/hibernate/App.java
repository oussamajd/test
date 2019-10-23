package com.hibernate;



import java.util.List;



import com.hibernate.entity.user;

import com.hibernate.servicesImp.UserServiceImp;

import com.hibernate.controllers.Userbean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*try {
    		user user =new  user();
    		System.out.println("user created");
    		user.setNom("jedidi");
    		user.setPrenom("oussema");
    		
    		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    		System.out.println("SessionFactory created ");
    		
    		Session session = sessionFactory.openSession();
    		System.out.println("session opened");
    		session.beginTransaction();
    		session.save(user);
    		System.out.println("inserted successfully");
    		session.beginTransaction().commit();
    		session.close();
    		sessionFactory.close();
			
		} catch (Exception e) {
			System.err.println(e);
			// TODO: handle exception
		}
	*/
    /*
    	UserServiceImp userService = new UserServiceImp();
    	user user = new user();
    	user.setNom("nom");
    	user.setPrenom("prenom");
    	System.out.println(user.toString()+"is ready");
    	userService.adduser(user);
    	System.out.println("Displaying all Employee Info : ");
    	List<user> users = userService.userslist();
        for (user user1 : users) {
            System.out.println(user1);
            
        }
        */
        /*
        user user61 =userService.findById(61);
        System.out.println("After Saving Employee Info : "+user61.toString());
        */
    	
    	/* test for userbean */ 
    	
    	Userbean userbean = new Userbean();
    	userbean.setNom("testuserbean");
    	userbean.setPrenom("testuserbean");
    	userbean.setUser();
    	userbean.ajouter();
   
    	
    	
    	  List<user>  users=userbean.getUsers();
    	  for (user user1 : users) {
              System.out.println(user1);
              
          }
    	  user user = new user();
    	  user.setNom("malek");
    	  user.setPrenom("wchem");
      	  userbean.supprimer(user);
    	  
    	  System.out.println("after remove ");
    	  
    	  List<user>  usersafter=userbean.getUsers();
    	  for (user user1 : usersafter) {
              System.out.println(user1);
            
          }
   } 
}
