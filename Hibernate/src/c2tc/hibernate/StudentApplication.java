package c2tc.hibernate;

import java.util.Scanner;

import c2tc.hibernate.entities.Student;
import c2tc.hibernate.service.StudentService;
import c2tc.hibernate.service.StudentServiceImpl;

public class StudentApplication {
	public static void main(String args[])
	{
		// storing the values
		Scanner s = new Scanner(System.in);
		StudentService service = new StudentServiceImpl();
		//System.out.println("Enter the details");
		
		//Student student = new Student(s.nextInt(),s.next());
		//service.addStudent(student);
		// retriveing 
		//System.out.println("Enter the uid to retrive");
		System.out.println("Enter the details");
		int uid = s.nextInt();
		s.nextLine();
		String name =s.nextLine();
		Student student = new Student(uid,name);
		//Student student= new Student();
		//student.setUid(s.nextInt());
		//student= service.getStudent(s.nextInt());
		student= service.updateStudent(student);
		System.out.println(student);
		
		//updating
		
		s.close();
	}


}
