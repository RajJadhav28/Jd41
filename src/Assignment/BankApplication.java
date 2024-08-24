package Assignment;

import java.util.Scanner;

class bank{
	double balance=2000, deposite, withdraw,amt;
	void display() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Congrulations your account has been created.");
		System.out.println("Available balance:"+balance);
		System.out.println("Enter the deposite amount:");
		deposite=sc.nextDouble();
		amt=deposite+balance;
		System.out.println("Deposite Complete.");
		System.out.println("Balance after deposite:"+amt);
		System.out.println("Enter the withdrawl amount:");
		withdraw=sc.nextDouble();
		if(withdraw>0) {
			double cb=amt-withdraw;
			if(withdraw<=amt) {
				System.out.println("Balance after withdrawl:"+cb);
				System.out.println("Withdrawl has been completed.");
			}else {
				System.out.println("Insufficient balance!!!");
			}
		}
		sc.close();
	}
}
public class BankApplication {
	public static void main(String[] args) {
		bank obj=new bank();
		obj.display();
	}

}
