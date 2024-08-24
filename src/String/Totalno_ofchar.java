package String;

public class Totalno_ofchar {

	public static void main(String[] args) {
		String s1="quastech class";
		int c=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=' ') {
				c++;
			}
		}
		System.out.println("No of characters:"+c);

	}

}
