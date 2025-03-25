package bankingsystem;

import java.util.*;

public class BankAccountMain {
	
	static Scanner sc = new Scanner(System.in);
	static Random r = new Random();
	private static String usn = "Rakesh143";
	private static String pwd = "Rakesh@143";
	private static int otp1 = r.nextInt(10000);

	public static void main(String[] args) {

		System.out.println("Login with Valid Creditials");

		if (login()) {
			int option = 0;
			while (option != 4) {
				System.out.println(
						"\n1.Savings Account \n2.Current Account\n3.Fixed Deposit Account \n4.Logout \nChoose Option from above :");
				option = sc.nextInt();
				switch (option) {
				case 1: {
					savingsAccount();
					break;
				}
				case 2: {
					currentAccount();
					break;
				}
				case 3: {
					fixedDepositAccount();
					break;
				}
				case 4: {
					System.out.println("Logout Successful");
					break;
				}
				default:
					System.out.println("Incorrect Option");
				}
			}
		} else {
			System.out.println("Incorrect Usename or Password.Please Login with Valid Credentials ");
		}

	}

	private static boolean login() {
		System.out.print("Enetr Username : ");
		String username = sc.nextLine();
		System.out.print("Enter Password : ");
		String password = sc.nextLine();
		System.out.println("Your Generated Otp is : " + BankAccountMain.otp1);
		System.out.print("Enter Otp : ");
		int otp = sc.nextInt();

		if ((username.equals(usn) && password.equals(pwd))&& otp==otp1) {
			System.out.println("\nLogin Successful..!!!!!!!");
			return true;
		} else {
			return false;
		}
	}

	private static void fixedDepositAccount() {

		FixedDepositAccount f = new FixedDepositAccount(500000);
		int option = 0;
		while (option != 4) {
			System.out.println(
					"\n1.CheckBalance \n2.Deposit\n3.Withdrwan \n4.Exit and Return to Main Menu \nChoose Option from above :");
			option = sc.nextInt();
			switch (option) {

			case 1: {
				System.out.println("Your Current Balance is : " + f.getBalance());
				break;
			}
			case 2: {
				f.deposit();
				break;
			}
			case 3: {
				f.withdraw();
				break;
			}
			default:
				System.out.println(option != 4 ? "Incorrrect Option" : "Returned to Main Menu");
			}
		}

	}

	private static void currentAccount() {

		CurrentAccount c = new CurrentAccount(10000);
		int option = 0;
		while (option != 4) {
			System.out.println("\n1.CheckBalance \n2.Deposit\n3.Withdrwan \n4.exit \nChoose Option from above :");
			option = sc.nextInt();
			switch (option) {

			case 1: {
				System.out.println("Your Current Balance is : " + c.getBalance());
				break;
			}
			case 2: {
				c.deposit();
				break;
			}
			case 3: {
				c.withdraw();
				break;
			}
			default:
				System.out.println(option != 4 ? "Incorrrect Option" : "Returned to Main Menu");
			}
		}

	}

	private static void savingsAccount() {

		SavingsAccount s = new SavingsAccount(500);
		int option = 0;
		while (option != 4) {
			System.out.println("\n1.CheckBalance \n2.Deposit\n3.Withdrwan \n4.exit \nChoose Option from above :");
			option = sc.nextInt();
			switch (option) {

			case 1: {
				System.out.println("Your Current Balance is : " + s.getBalance());
				break;
			}
			case 2: {
				s.deposit();
				break;
			}
			case 3: {
				s.withdraw();
				break;
			}
			default:
				System.out.println(option != 4 ? "Incorrrect Option" : "Returned to Main Menu");

			}
		}
	}
}
