package basic;

public class StringProgarmm1 {

	public static void main(String[] args) {

		String s = "yogesh";
		String temp = "";

		for (int i = 0; i < s.length(); i++) {

			if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {

				temp = temp + ((char)(s.charAt(i) +32));

			} else if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) {
				temp = temp + ((char)(s.charAt(i) -32));
			}
		}
		
		System.out.println(temp);

	}

}
