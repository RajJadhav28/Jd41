package Assignment;

import java.util.Scanner;

class InsufficientFundsException extends Exception{
	public InsufficientFundsException(String message) {
		super(message);
	}
}
class Bankaccount{
	private double balance;
	Bankaccount(double balance){
		this.balance=balance;
	}
	public double getbalance() {
		return balance;
	}
	public void withdraw(double amount)throws InsufficientFundsException{
		if(amount>balance) {
			throw new InsufficientFundsException("Insufficient balance:"+balance);
		}else {
			balance-=amount;
			System.out.println("Successfully withdrew $:"+amount);
		}
	}
}
public class Bank_system_CustomException {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the balance amount:");
		double balance=sc.nextDouble();
		System.out.println("Enter the withdrawl amount:");
		double withdraw=sc.nextDouble();
		Bankaccount a=new Bankaccount(balance);
		System.out.println("Current balance:"+a.getbalance());
		try {
			a.withdraw(withdraw);
		}catch(InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Final balance:"+a.getbalance());
		sc.close();
	}

}
