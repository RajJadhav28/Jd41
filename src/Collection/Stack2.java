package Collection;

import java.util.Stack;

public class Stack2 {

	public static void main(String[] args) {
		Stack<String>animals=new Stack<String>();
		animals.push("Dog");
		animals.push("Cat");
		animals.push("Lion");
		animals.push("Tiger");
		System.out.println("Stack:"+animals);
		System.out.println(animals.pop());
		String element=animals.pop();
		System.out.println("Removed element:"+element);
		System.out.println(animals.peek());
		int position=animals.search("Cat");
		System.out.println(position);

	}

}
