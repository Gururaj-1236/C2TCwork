package c2tc.hibernate.entities;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student {
	@Id
	private int uid;
	private String name;
	
	@Override
	public String toString() {
		return "Student [uid=" + uid + ", name=" + name + "]";
	}
	public Student(int uid, String name) {
		super();
		this.uid = uid;
		this.name = name;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
