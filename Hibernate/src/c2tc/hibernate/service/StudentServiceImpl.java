package c2tc.hibernate.service;

import c2tc.hibernate.entities.Student;
import c2tc.hibernate.repo.StudentRepo;
import c2tc.hibernate.repo.StudentRepoImpl;

public class StudentServiceImpl implements StudentService {
	
	StudentRepo repo;
	public StudentServiceImpl()
	{
		repo = new StudentRepoImpl();
	}
	
	public void addStudent (Student student)
	{
		repo.startTranscation();
		repo.addStudent(student);
		repo.endTranscation();
	}

	@Override
	public Student getStudent(int rollno) {
		Student student = repo.getStudent(rollno);
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		repo.startTranscation();
		Student s = repo.updateStudent(student);
		repo.endTranscation();
		return s;
	}

}
