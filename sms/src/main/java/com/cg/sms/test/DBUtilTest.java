package com.cg.sms.test;

import com.cg.sms.daoimpl.StudentDAOImpl;
import com.cg.sms.domain.Student;

public class DBUtilTest {
	public static void main(String args[])
	{
	 StudentDAOImpl stdimpl=new StudentDAOImpl();
	 Student stud=new Student();//104, "ivl", "dheeraj", "ivldheeraj@gmail.com", "425454","ECE");
	 
	 stdimpl.add(stud);
	 System.out.println("Added successfully!");
	 
	/* stdimpl.delete(102);
	 System.out.println("Deleted successfully!");

*/
	}
}
