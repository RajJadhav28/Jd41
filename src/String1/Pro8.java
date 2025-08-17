package String1;

public class Pro8 {

	public static void main(String[] args) {
		String s1="Quastech training institute";
		int c=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=' ') {
				c++;
			}
		}
		System.out.println("Total char values:"+c);
		int c1=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==' ') {
				c1++;
			}
		}
		System.out.println("Total no. of spaces:"+c1);
		String[] words=s1.trim().split("\\s+");
		//The split() method is used to divide the string into an array 
		//of substrings based on a specified delimiter.
		int wordcount=words.length;
		System.out.println("Number of words:"+wordcount);
		System.out.println("Number of charsvalues1:"+(c1+1));
		

	}

}
