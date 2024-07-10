package com.to;  
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;  
  
public class StoreData {  
  
    public static void main( String[] args )  
    {  
            Configuration cfg = new Configuration();
    		cfg.configure("/hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();  
        Session session = factory.openSession();  
        Transaction t = session.beginTransaction();  
          
         Employee e1=new Employee();    
            e1.setId(1);    
            e1.setFirstName("Gowtham");    
            e1.setLastName("Charan");    
         
       session.save(e1);  
       t.commit();  
       System.out.println("successfully saved");    
        factory.close();  
        session.close();     
    }  
}  