package ExceptionHandling;

import java.util.Scanner;

public class Elegiable_to_vote {
	static void elegiable(int age) {
		if(age<18) {
			throw new ArithmeticException();
		}else {
			System.out.println("elegiable to vote");
			
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		try {
			elegiable(age);
		}catch(Exception e) {
			System.out.println("Not elegiable to vote");
			e.printStackTrace();
		}
		sc.close();
	}

}
