package Java8features;

import java.util.Scanner;

interface A26{
	public double area(int r);
}
public class Pro26 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		A26 obj=(r)->{
			double area=3.14*r*r;
			return area;
		};
		System.out.println("Enter the radius:");
		int r=sc.nextInt();
		System.out.println(obj.area(r));
		sc.close();

	}

}
