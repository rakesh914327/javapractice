package encpsulation;
import java.util.Scanner;

public class BankAccount {
	static Scanner sc = new Scanner(System.in);
	private double balance;
	double amount;

	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	public  double deposit(double amount) {
		if (amount>0) 
		{
			balance=balance+amount;
			System.out.println("Amount Deposited Successfully :" + amount);
			
		} 
		else 
		{
			System.out.println("Enter Valid Amount :");
		}
		return 0;
	}
	public double withdraw(double amount) 
	{
		if (amount>0 && amount <= balance) 
		{
			balance=balance-amount;
			System.out.println("Successfully Withdrawn : " + amount);
		} 
		else 
		{
			System.out.println("Enter Valid Amount :");
		}
		return 0;
		
	}
	public double getBalance() {
		return balance;
	}
}
