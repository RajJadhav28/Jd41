package String1;

import java.util.Scanner;

public class Palandrome {

	public static void main(String[] args) {
		String s, rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		s=sc.next();
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println("Palandrome");
		}else {
			System.out.println("Not Palandrome");
		}
		sc.close();
	}

}
