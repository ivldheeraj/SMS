package com.cg.sms.daoimpl;

import java.util.List;

import com.cg.sms.dao.StudentDAO;
import com.cg.sms.domain.Student;
import com.cg.sms.util.DBUtil;

public class StudentDAOImpl extends DBUtil implements StudentDAO {

	@Override
	public void add(Student stud)
	{
		//Student stud = new Student();
		//stud.setStdId(20);
		/*stud.setFirstName("ravi");
		stud.setLastName("rao");
		stud.setEmail("ravi@gmail.com");
		stud.setContact("25545257");
		stud.setBranch("CSE");*/
		//persist entity
		em.getTransaction().begin();
		em.persist(stud);
		em.getTransaction().commit();
	}

	

	@Override
	public void delete(int empID) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		Student student=em.find(Student.class, empID);
		em.remove(student);
		em.getTransaction().commit();
		
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
