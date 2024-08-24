package String;

public class TotalNo_ofWords {

	public static void main(String[] args) {
		String s1="Welcome to Quastech";
		int c=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==' ') {
				c++;
			}
		}
		System.out.println("Total no. of words:"+(c+1));
	}
}
