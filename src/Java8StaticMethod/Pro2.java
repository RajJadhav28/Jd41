package Java8StaticMethod;

import java.util.Scanner;

interface A2{
	public void add(int a, int b);
}
public class Pro2 {
	public static void sumofadd(int a, int b) {
		int c=a+b;
		System.out.println("Sum of add:"+c);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a,b:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		A2 obj=Pro2::sumofadd;
		obj.add(a, b);
		sc.close();
	}

}
