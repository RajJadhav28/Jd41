package Java8StaticMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee{
	private int id;
	private String name;
	private double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
public class Pro6 {
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		Employee e1=new Employee(1, "ABC", 25000.0);
		Employee e2=new Employee(2, "AB", 25000.0);
		Employee e3=new Employee(3, "ABD", 25000.0);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		 Collections.sort(list, (a, b) -> a.getName().compareTo(b.getName()));
		 list.forEach(System.out::println);
	}
}
