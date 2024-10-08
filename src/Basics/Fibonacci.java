package Basics;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		int sum1=0;
		int sum2=1;
		int sum3;
		for(int i=1;i<=n;i++) {
			sum3=sum1+sum2;
			sum1=sum2;
			sum2=sum3;
			System.out.println(sum3);
		}
		sc.close();
	}

}
