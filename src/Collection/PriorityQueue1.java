package Collection;

import java.util.Queue;
import java.util.PriorityQueue;


public class PriorityQueue1 {
	public static void main(String[] args) {
		 Queue<Integer> q = new PriorityQueue<>(); // Fix typo and match the generic type
	        q.add(10); // Add an Integer to the queue
	        q.add(20);
	        q.add(5);

	        System.out.println("PriorityQueue elements: " + q);
	        
	        Queue<Integer>q1=new PriorityQueue<Integer>();
	        q1.add(20);
	        q1.add(21);
	        q1.add(22);
	        q1.add(24);
	        q1.add(23);
	        System.out.println(q1);
	        System.out.println("head:"+q1.element());
	        System.out.println("head:"+q1.peek());
	        System.out.println(q1.poll());
	}

	

}
