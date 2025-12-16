package Java8Lambda;

import java.util.Scanner;

interface a22{
	public int add(int a, int b);
}
public class Pro1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter tha value of a:");
		int a=sc.nextInt();
		System.out.println("Enter tha value of a:");
		int b=sc.nextInt();
		 a22 obj=(int i, int j)->{
			 return a+b;
		 };
		 System.out.println(obj.add(a, b));
		 sc.close();
	}
}
