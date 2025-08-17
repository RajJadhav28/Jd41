package Collection;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>();
		al.add("Ajay");
		al.add("Vijay");
		System.out.println("Initial elements:"+al);
		al.add(1,"Gaurav");
		System.out.println("After adding elements at position 1:"+al);
		ArrayList<String>al1=new ArrayList<String>();
		al1.add("Sonu");
		al1.add("Monu");
		al.addAll(al1);
		System.out.println("After adding second list elements to first:"+al);
		ArrayList<String>al3=new ArrayList<String>();
		al.addAll(1,al3);
		System.out.println("3rd list elements:"+al);
	}

}
