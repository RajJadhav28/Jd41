package Basics;

import java.util.Scanner;

public class StrongNumber1 {
	public static int factorial(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
			//System.out.println(f);
		}
		return f;
	}
	public static boolean isStrong(int n) {
		int sum=0,rem;
		int temp=n;
		while(n>0) {
		rem=n%10;
		sum=sum+factorial(rem);
		n=n/10;
		}
		return  sum==temp; 
		
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		if(isStrong(i)) {
			System.out.println(i);
		}
	}
	sc.close();
	}

}
