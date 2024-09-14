package InstanceMethodReference;

import java.util.Scanner;

interface Addition{
	public void show(int a, int b);
}
public class Pro3 {
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
		Pro3 obj=new Pro3();
		Addition a1=obj::add;
		a1.show(a, b);
		sc.close();
	}

}
