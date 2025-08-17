package Collection;

import java.util.Iterator;
import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		Stack<Integer>stk=new Stack<Integer>();
		stk.push(78);
		stk.push(113);
		stk.push(90);
		stk.push(120);
		System.out.println("Elements in stack:"+stk);
		System.out.println("After using iterator():");
		Iterator<Integer>itr=stk.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		boolean result=stk.empty();
		System.out.println("Is stack empty:"+result);
		
	}

}
