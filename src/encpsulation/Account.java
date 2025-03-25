package encpsulation;
public class Account {
	public static void main(String[] args) {
		int num =2;
		System.out.print("Enetr Intial Balance : ");
		BankAccount bankAccount = new BankAccount(BankAccount.sc.nextDouble());
		while(num!=0) {
			System.out.println("Menu :\n1.Current Balance\n2.Deposit Amount\n3.Withdraw Amount\n4.Exit");
			num =BankAccount.sc.nextInt();
			switch (num) {
			case 1: {
				
				bankAccount.getBalance();
				break;
			}
			case 2: {
				System.out.print("Enter The Amount to Deposit : ");
				bankAccount.deposit(bankAccount.sc.nextDouble());
				break;
			}
			case 3: {
				System.out.println("Enter the amount to withdrawn");
				bankAccount.withdraw(bankAccount.sc.nextDouble());
				break;
			}
			default:
				System.out.println("Enter Correct Value :");
			}
		}
			

	}

}
