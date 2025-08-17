package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<String>li=new LinkedList<String>();
		li.add("Naruto");
		li.add("Sasuke");
		li.add("Sakura");
		System.out.println(li);
		Iterator<String> itr=li.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		LinkedList<String>li1=new LinkedList<String>();
		li1.add("Hinata");
		li1.add("Kiba");
		System.out.println(li1);
		li.addAll(li1);
		//System.err.println(li);
		System.out.println(li);
		li.addFirst("kakshi");
		li.addLast("Jiriya");
		System.out.println(li);
		LinkedList<String>al2=(LinkedList<String>)li.clone();
		System.out.println(al2);
		

	}

}
