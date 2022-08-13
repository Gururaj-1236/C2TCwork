package c2tc.hibernate.repo;
import javax.persistence.EntityManager;
import c2tc.hibernate.entities.Student;

public class StudentRepoImpl implements StudentRepo {
	EntityManager manager;

	public StudentRepoImpl() {
		manager =Configration.getEntityManager();
	}

	@Override
	public void addStudent(Student student) {
		manager.persist(student);
		
		
	}

	@Override
	public void startTranscation() {
		manager.getTransaction().begin();
		
	}

	@Override
	public void endTranscation() {
		manager.getTransaction().commit();
		
	}

	@Override
	public Student getStudent(int rollno) {
		Student student = manager.find(Student.class, rollno);
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		Student s=manager.merge(student);
		return s;
	}

}

