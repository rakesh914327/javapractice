/* Write a Programm to illustrate Loose Coupling and UpCasting By Considering payment Feature in Amazon E-Commerce Application
 requirement is 
 The user should  be able to Select while Making the Payment(At least 2 Banks)*/

package typeCasting;

public class ICICI implements Amazon {

	@Override
	public void payment() {
		
		System.out.println("\nSuccesfully Payment Done by ICICI");
		
	}
	
	

}
