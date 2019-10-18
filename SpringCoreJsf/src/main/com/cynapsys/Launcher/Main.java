package main.com.cynapsys.Launcher;

import org.hibernate.Session;
import org.hibernate.Transaction;
import main.com.cynapsys.utils.*;

public class  Main {
	 
	public static void  main(String[] args) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			System.out.println("session is opened");
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("error");
		}

}
}

