/*package com.hibernate;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.entity.user;
import com.hibernate.servicesImp.UserServiceImp;
import com.hibernate.util.HibernateUtil;
import com.hibernate.controllers.Userbean;


 
public class App 
{
    public static void main( String[] args )
    {
    	
    	
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
      
        user user61 =userService.findById(61);
        System.out.println("After Saving Employee Info : "+user61.toString());
        
    	
    	
    	Userbean userbean = new Userbean();
    	userbean.setNom("testuserbean");
    	userbean.setPrenom("testuserbean");
    	userbean.setUser();
    	userbean.ajouter();
   
    	
    	
    	  List<user>  users1=userbean.getUsers();
    	  for (user user1 : users1) {
              System.out.println(user1);
              
          }
    	  user user1 = new user();
    	  user1.setNom("testuserbean");
    	  user1.setPrenom("testuserbean");
    	 
      	  userbean.supprimer();
    	  
    	  System.out.println("after remove ");
    	  
    	  List<user>  usersafter=userbean.getUsers();
    	  for (user user11 : usersafter) {
              System.out.println(user11);
            
          }
   } 
}

*/
