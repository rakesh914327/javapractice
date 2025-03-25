package bankingsystem;

public class SavingsAccount extends BankAccount {

	private double balance;

	public SavingsAccount(double balance) {
		this.balance = balance;
	}

	public void deposit() {
		System.out.print("Enter The Amount to Deposit : ");
		double amount = BankAccount.sc.nextDouble();
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("Amount Deposited Successfully :" + amount);
			System.out.println("Total Balance is : " + balance);

		} else {
			System.out.println("Enter Valid Amount :");
		}

	}

	public void withdraw() {

		System.out.print("Enter The Amount to Withdraw : ");
		double amount = BankAccount.sc.nextDouble();

		if (amount > 0 && amount <= balance) {
			balance = balance - amount;
			System.out.println("Successfully Withdrawn : " + amount);
			System.out.println("Total Balance is : " + balance);
		} else {
			System.out.println("Enter Valid Amount :");
		}

	}

	public double getBalance() {
		return balance;
	}

}
