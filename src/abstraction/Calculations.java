package abstraction;

public class Calculations implements ArithematicOperations {
	

	public void addition(int a , int b) {
		
		System.out.println(a+b);
	}

	public void subraction(int a , int b) {
			
			System.out.println(a-b);
		}

	public void multiplication(int a , int b) {
			
			System.out.println(a*b);
		}

	public void division(int a , int b) {
			
			System.out.println(a/b);
		}

	public void modulus(int a , int b) {
			
			System.out.println(a%b);
		}

}
