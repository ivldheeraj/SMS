package com.cg.sms.dao;

import java.util.List;

import com.cg.sms.domain.Student;


public interface StudentDAO {
    
	
	void delete(int empID);

	void update(Student student);

	List<Student> findAll();

	void add(Student stud);

}
