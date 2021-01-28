package com.cg.sms.daoimpl;

import java.util.List;

import com.cg.sms.dao.DepartmentDAO;
import com.cg.sms.domain.Department;
import com.cg.sms.util.DBUtil;

public class DepartmentDAOImpl extends DBUtil implements DepartmentDAO {

	@Override
	public void add(Department department) {
		/*department.setDeptName("MECH");
		department.setDeptHead("John");
		department.setDeptContact("9999");*/
		em.getTransaction().begin();
		em.persist(department);
		em.getTransaction().commit();
		
	}

	@Override
	public void delete(int empID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Department department) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
