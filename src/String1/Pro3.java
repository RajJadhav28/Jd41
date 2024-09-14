package String1;

public class Pro3 {

	public static void main(String[] args) {
		String s="Sachin";
		s.concat("Tendulkar");
		System.out.println(s);//Does not concats
		s=s.concat("Tendulkar");//concats 
		System.out.println(s);
		String s1="Sachin";//Stored in constant pool
		String s2=new String("Sachin");//Stored in Heap Memory
		String s3="Sachin";
		String s4="SACHIN";
		String s5="Ratan";
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareTo(s5));

	}

}
