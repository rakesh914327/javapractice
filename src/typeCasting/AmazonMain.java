package typeCasting;

import java.util.Scanner;

public class AmazonMain {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Amazon a;
		
		System.out.print("Make the Payment \n \n1.SBI\n2.ICICI\n\nChoose the  Payment Option :");
		int n = sc.nextInt();
		
		switch (n) {
		case 1: {
			a = new SBI();
			a.payment();
			break;
		}
		case 2: {
			a = new ICICI();
			a.payment();
			break;
		}
		default:System.out.println("Enter The Correct Input");
		}
	}

}
