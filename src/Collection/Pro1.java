package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Pro1 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Grapes");
		list.add("Banana");
		list.add("Mango");
		System.out.println(list);
		
		Iterator<String>itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("foreachLoop:");
		for(String fruit:list) {
			System.out.println(fruit);
		}
		System.out.println("Returning the elements:"+list.get(1));
		list.set(1, "Dates");
		for(String fruit:list) {
			System.out.println(fruit);
		}
	}

}
