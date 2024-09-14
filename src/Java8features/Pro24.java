package Java8features;

import java.util.Scanner;

interface A24{
	public void show(int num);
}
public class Pro24 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		A24 obj=(num)->{ int sum=0;
			for(int i=0;i<=num;i++) {
				sum=sum+i;
			}
			System.out.println(sum);
		};
		System.out.println("Enter the value:");
		int num=sc.nextInt();
		obj.show(num);
		sc.close();
	}

}
