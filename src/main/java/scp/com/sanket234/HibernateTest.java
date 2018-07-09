package scp.com.sanket234;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateTest {
	public static void main(String[] args) {
		
		SessionFactory sfactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	    Session session1 = sfactory.openSession();
         Transaction tx = session1.beginTransaction();

         Emp emp1 = new Emp(1,"rahul","k",1323);
         Emp emp2 = new Emp(3,"sanket","payghan",1323);
         Emp emp3 = new Emp(4,"nikhil","A",1323); 
         Emp emp4 =new Cemp(5,"sdf","sdf",4756,"sdf");
         session1.save(emp1);
         session1.save(emp2);
         session1.save(emp3);
        session1.save(emp4);
         session1.flush();
         tx.commit();
        
		
	}
	
	
	


}
