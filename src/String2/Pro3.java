package String2;

public class Pro3 {

	public static void main(String[] args) {
		String s="Mahindra";
		s.concat(" SinghDhoni");
		System.out.println(s);
		s=s.concat(" SinghDhoni");
		System.out.println(s);
		String s1="Mahindra";
		String s2=new String("Mahindra");
		String s3="Mahindra";
		String s4="MAHINDRA";
		String s5="Ratan";
		System.out.println(s1==s2);//false because s1 is Stored in constant pool and s2 is Stored in Heap Memory.
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareTo(s5));

	}

}
