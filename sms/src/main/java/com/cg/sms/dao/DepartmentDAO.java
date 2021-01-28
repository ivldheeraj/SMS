package com.cg.sms.dao;

import java.util.List;

import com.cg.sms.domain.Department;


public interface DepartmentDAO {
	
	void add(Department department);

	void delete(int empID);

	void update(Department department);

	List<Department> findAll();


}
