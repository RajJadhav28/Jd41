package Basics;

import java.util.Scanner;

public class PerfectNumber2 {
	public static boolean isPerfect(int num) {
		int sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
			sum=sum+i;
			}
		}
		return sum==num;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(isPerfect(i)) {
				System.out.println("Perfect Number:"+i);
			}
		}
		sc.close();
	}

}
