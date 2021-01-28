package com.cg.sms.util;

import javax.persistence.*;


public class DBUtil {

	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("smsdb");  
	     protected EntityManager em=emf.createEntityManager();
		
	   
	 
}
