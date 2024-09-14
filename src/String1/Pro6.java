package String1;

public class Pro6 {

	public static void main(String[] args) {
		String s="Sachin Tendulkar";
		System.out.println(s.substring(6));//will count from 6
		System.out.println(s.substring(0,6));//will count from 6 and last index will be exclusive
		String s1="Smart";
		String s2="Training";
		System.out.println(s1.concat(s2));
		String s3=s1.concat(s2);
		System.out.println(s3);
		System.out.println(s2);
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toUpperCase().concat(s2));
		System.out.println("s1+s2:"+s1+s2);
		String s4=String.join("-",s1,s2);
		System.out.println(s4);
		System.out.println(s1.startsWith("SM"));
		System.out.println(s1.startsWith(s4));
		System.out.println(s1.endsWith("art"));
		System.out.println(s1.endsWith("ART"));
		System.out.println(s1.contains("AR"));
		System.out.println(s1.contains("ar"));
	}
}
