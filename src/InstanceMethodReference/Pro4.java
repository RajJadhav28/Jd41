package InstanceMethodReference;

import java.util.Scanner;

interface Addition1{
	public void show(int a, int b);
}
public class Pro4 {
	public void add(int a, int b) {
		int c=a+b;
		System.out.println("Addition:"+c);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		Pro4 obj=new Pro4();
		Addition1 a1=obj::add;
		a1.show(a,b);
		sc.close();
		}
}
