package Java8StaticMethod;

import java.util.Scanner;

interface A3{
	public void show(int a, int b);
}
public class Pro3 {
	public static void add(int a, int b) {
		int c=a+b;
		System.out.println("Addition of numbers:"+c);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		A3 obj=Pro3::add;
		obj.show(a, b);
		sc.close();
	}

}
