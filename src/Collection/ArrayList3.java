package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList3 {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		al.add("Jason");
		System.out.println("Initial elements:"+al);
		Iterator<String>itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		al.remove("Vijay");
		System.out.println(al);
		al.remove(0);
		System.out.println(al);
		ArrayList<String>al2=new ArrayList<String>();
		al2.add("Ravi");
		al2.add("Hanumant");
		al.addAll(al2);
		System.out.println(al);
		al.removeIf(str->str.contains("Ajay"));
		System.out.println(al);
		al.clear();
		System.out.println(al);

	}

}
