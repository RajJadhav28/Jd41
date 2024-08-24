//package Assignment;
//
//import java.util.Scanner;
//
//class Bank extends Exception{
//	Scanner sc=new Scanner(System.in);
//	double balance=2000, withdraw, deposite, totalbalance;
//	Bank(double withdraw){
//		this.withdraw=withdraw;
//	}
//	@Override
//	public String toString() {
//		return "Bank [balance=" + balance + ", withdraw=" + withdraw + ", deposite=" + deposite + ", totalbalance="
//				+ totalbalance + "]";
//	}
//	
//}
//public class CustomExceptionBankApp {
//	
//	static double balance=2000;
//	double withdraw;
//	double deposite;
//	double totalbalance;
//	static void calculate(double deposite, double withdraw) throws Bank{
//		if(deposite>0) {
//			Scanner sc=new Scanner(System.in);
//			System.out.println("Enter the deposite amount:");
//			double totalbalance= deposite+balance;
//			System.out.println("Enter the witdraw amount:");
//			withdraw=sc.nextDouble();
//			if(withdraw<totalbalance) {
//				double finaltotalbalance=totalbalance-withdraw;
//				System.out.println("Balance:"+finaltotalbalance);
//			}else {
//				System.out.println("Insufficient Balance!!!....");
//			}
//		}else {
//			System.out.println("Enter a valid number!!!...");
//		}
//	}
//
//	public static void main(String[] args) {
//		
//
//	}
//
//}
