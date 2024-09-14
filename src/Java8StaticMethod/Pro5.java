package Java8StaticMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student{
	private int id;
	private String name;
	private int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
public class Pro5 {
	public static int compareByname(Student a, Student b) {
		return a.getName().compareTo(b.getName());
	}
	public static void main(String[] args) {
		List list=new ArrayList();
		Student s1=new Student(1, "sam", 24);
		Student s2=new Student(1, "ram", 24);
		Student s3=new Student(1, "shyam", 24);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		Collections.sort(list,Pro5::compareByname);
		//object::method
		list.forEach(System.out::println);

	}

}
