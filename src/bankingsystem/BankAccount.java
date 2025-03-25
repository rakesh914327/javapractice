package bankingsystem;

import java.util.*;

public abstract class BankAccount {

	public static Scanner sc = new Scanner(System.in);
	protected static double balance;
	private String accountHolderName = "Rakesh Kothapally";
	private long accountNumber = 62380313406l;

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public abstract void deposit();

	public abstract void withdraw();

}
