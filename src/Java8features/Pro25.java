package Java8features;

import java.util.Scanner;

interface A25{
	public int show(int l, int b);
}
public class Pro25 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		A25 obj=(l,b)->{
			int area=l*b;
			return area;
	};
	System.out.println("Enter the length:");
	int l=sc.nextInt();
	System.out.println("Enter the breadth:");
	int b=sc.nextInt();
	System.out.println("Area of reactangle:"+obj.show(l, b));
	sc.close();
	}

}
