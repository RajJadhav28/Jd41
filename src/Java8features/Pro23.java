package Java8features;

import java.util.Scanner;

interface A23{
	public void show(int num, int n);
}
public class Pro23 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		A23 obj=(num,n)->{int sum=0;
		for(int i=1;i<=n;i++) {
			sum=num*i;
			
		}System.out.println(sum);};
		System.out.println("Enter the value:");
		int num=sc.nextInt();
		System.out.println("Enter number of iterations:");
		 int n = sc.nextInt();
		obj.show(num,n);
		sc.close();
	}

}
