package Java8features;

import java.util.Scanner;

interface A21{
	public void add(int a, int b);
}
public class Pro13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter tha value of a:");
		int a=sc.nextInt();
		System.out.println("Enter tha value of a:");
		int b=sc.nextInt();
		A21 obj=(int i, int j)->{System.out.println("Addition:"+(a+b));};
		obj.add(a, b);
		sc.close();
	}

}
