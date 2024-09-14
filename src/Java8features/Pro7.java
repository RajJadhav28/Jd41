package Java8features;

import java.util.Scanner;

interface AB{
	public void add(int a, int b);
}
public class Pro7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		AB obj=(int i, int j)->{
			System.out.println(a+b);
		};
		obj.add(a, b);
		sc.close();
	}

}
