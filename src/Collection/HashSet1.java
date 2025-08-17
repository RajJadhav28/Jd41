package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet<String>set=new  HashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Three");
		Iterator< String>itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		set.remove("One");
		System.out.println(set);
		HashSet<String>set1=new  HashSet<String>();
		set1.add("Four");
		set1.add("Five");
		set.addAll(set1);
		System.out.println(set);
		set.removeAll(set1);
		System.out.println(set);
		set.removeIf(str->str.contains("Two"));
		System.out.println(set);

	}

}
