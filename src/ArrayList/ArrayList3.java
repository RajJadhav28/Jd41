package ArrayList;

import java.util.ArrayList;

public class ArrayList3 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Ravi");
		al.add("Ajay");
		al.add("Vijay");
		al.add("Raj");
		al.add("Jay");
		System.out.println("Initial elements:"+al);
		//Removing specific elements from ArrayList
		al.remove("Vijay");
		System.out.println("Removing specific elements from ArrayList:"+al);
		//Removing elements on the basis of specific position
		al.remove(0);
		System.out.println("Removing elements on the basis of specific position:"+al);

	}

}
