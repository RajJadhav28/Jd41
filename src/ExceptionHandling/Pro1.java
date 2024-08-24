package ExceptionHandling;

import java.util.Scanner;

public class Pro1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		int c;
		try {
			c=a/b;
			System.out.println("c:"+c);
		}catch(Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
