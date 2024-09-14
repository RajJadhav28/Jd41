package Java8StaticMethod;

import java.util.Scanner;
//Variables in interfaces are implicitly public static final and must be initialized with a value.
//They can have any valid data type (e.g., int, String, etc.).
//Methods in interfaces can return any valid data type,
//but they are typically abstract unless they are default or static methods.
interface A4{
	int c=20;
	public int show(int a, int b);
}
public class Pro4 {
	public static int add(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		A4 obj=Pro4::add;
		System.out.println(obj.show(a, b));
		System.out.println(obj.c);
		
	}

}
