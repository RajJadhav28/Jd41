package StringBuffer;

public class Pro1 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");
		sb.append("Java");
		System.out.println(sb);//HelloJava
		sb.insert(0, "php");
		System.out.println(sb);//phpHelloJava
		sb.delete(0, 3);//(int start, int end)-end index is exclusive
		System.out.println(sb);//HelloJava
		sb.reverse();
		System.out.println("reverse:"+sb);
		System.out.println("capacity:"+sb.capacity());
		StringBuffer sb1=new StringBuffer("JavaScript");
		System.out.println(sb1);
		sb1.append("ReactJs");
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		sb1.ensureCapacity(10);
		System.out.println(sb1.capacity());
		sb1.ensureCapacity(50);
		System.out.println(sb1.capacity());
	}

}
