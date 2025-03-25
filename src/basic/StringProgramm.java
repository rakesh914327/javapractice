package basic;

// write a programm to convert upper case alphabet to lower case and lower case alphabet to lower case
public class StringProgramm {

	static char ch = '$';

	public static void main(String[] args) {
		
		if((ch>='A' && ch<='Z')) {
			
			System.out.println((char)((int)ch +32));
		}
		else if((ch>= 'a' && ch<= 'z')) {
			System.out.println((char)((int)ch -32));
		}
		else {
			System.out.println("Incorrect Input");
		}
		
	}

}
