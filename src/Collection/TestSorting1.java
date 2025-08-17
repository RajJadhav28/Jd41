package Collection;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
	
	int empid;
	String name;
	public Employee(int empid, String name) {
		super();
		this.empid = empid;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + "]";
	}
	//	@Override
//	public int compareTo(Employee std) {
//		// TODO Auto-generated method stub
//		return this.empid-std.empid;
//	}
	public int compareTo(Employee std) {
		if(empid==std.empid) {
			return 0;
		}else if(empid>std.empid){
			return 1;
		}else {
			return -1;
		}
	}
}
public class TestSorting1 {

	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(2, "Raj"));
		list.add(new Employee(1, "Jay"));
		list.add(new Employee(3, "Yuvraj"));
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		Collections.sort(list);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		

	}

}
