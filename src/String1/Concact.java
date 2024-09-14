package String1;

public class Concact {

	public static void main(String[] args) {
		String s="Sachin";
		s.concat("Tendulkar");
		System.out.println(s);//concact() method appends method at end
		s=s.concat("Tendulkar");//will print Sachin because Strings are immutable
		System.out.println(s);
	}
}
