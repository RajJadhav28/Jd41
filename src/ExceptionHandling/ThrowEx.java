package ExceptionHandling;

import java.util.Scanner;

public class ThrowEx {
	static void fun(int a) {
		if(a==0) {
			throw new ArithmeticException();
		}else {
			System.out.println("The number:"+a);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		try {
			fun(a);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Number should not be zero.");
		}
		sc.close();
	}

}
