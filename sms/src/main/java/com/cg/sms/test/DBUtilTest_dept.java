package com.cg.sms.test;

import com.cg.sms.daoimpl.DepartmentDAOImpl;
import com.cg.sms.domain.Department;

public class DBUtilTest_dept {
	public static void main(String args[])
	{
	 DepartmentDAOImpl deptimpl =new DepartmentDAOImpl();
	 Department department = new Department();
    
	 deptimpl.add(department);
     
	 System.out.println("Added successfully!");
	}
}
