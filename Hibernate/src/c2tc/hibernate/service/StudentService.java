package c2tc.hibernate.service;

import c2tc.hibernate.entities.Student;

public interface StudentService  {

	void addStudent(Student student);

	Student getStudent(int nextInt);

	Student updateStudent(Student student);

	
	

}
