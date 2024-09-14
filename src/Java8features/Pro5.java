package Java8features;

import java.util.Scanner;

interface AA{
	int add(int a, int b);
}
public class Pro5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		AA obj=(int i, int j)->{
			return a+b;
		};
		System.out.println(obj.add(a, b));
		sc.close();

	}

}
