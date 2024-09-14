package ArrayList;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>();
		al.add("Ajay");
		al.add("Vijay");
		System.out.println("Initial elements:"+al);
		al.add(1,"Gaurav");
		System.out.println("After adding element 'Gaurav' at position 1st:"+al);
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("Sonu");
		al1.add("Monu");
		//Adding all second list elements to first and Printing first list
		al.addAll(al1);
		System.out.println("Adding all second list elements to first and Printing first list:"+al);
		ArrayList<String>al3=new ArrayList<String>(al1);
		//Adding list3  elements to first list
		al.addAll(1,al3);
		System.out.println("Adding list3  elements to first list:"+al);

	}

}
