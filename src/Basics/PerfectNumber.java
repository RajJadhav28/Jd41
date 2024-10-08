package Basics;

import java.util.Scanner;

public class PerfectNumber {
	public static boolean isPerferct(int num) {
		int sum=0;
		for(int i=1;i<=num/2;i++) {
			
			if(num%i==0) {
				sum=sum+i;
				System.out.println(sum);
				System.out.println("Divisiors:"+i);
			}
		}
		return sum==num;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		if(isPerferct(num)) {
			System.out.println("Is Perfect number");
		}else {
			System.out.println("Not Perfect number");
		}
		
	}

}
