package String1;

public class Pro7 {

	public static void main(String[] args) {
		String s1=" SMART";
		String s2="TRAINING";
		int value=30;
		String s3=String.valueOf(value);
		System.out.println(s3);
		char ch[]=new char[6];
		System.out.println(s1.charAt(5));
		char cha[]=s2.toCharArray();
		System.out.println(cha);
		for(int i=0;i<s2.length()-3;i++) {
			System.out.println(cha[i]);
		}
		s2.getChars(1, 5, ch, 0);
		System.out.println(s2);
		System.out.println(s2.replace('A', 'E'));
		System.out.println(s2.replace("TRAIN", "CRAV"));
		System.out.println(s2.replaceFirst("I", "O"));
		System.out.println(s2.replaceAll("N", "M"));
		System.out.println(s2);
		s2=s2.intern();//will place s2 in constant pool.
		System.out.println(s2);
	}

}
