package learning;

public interface P1 {
	final static int a =10;
	public static void s1() {
		System.out.println("Hiii");
	}
	public void  s2() {
		System.out.println("hello");
	}
	protected void s3() {
		System.out.println("How are You?");
	}
	private void s4() {
		System.out.println("Bye");
	}
	public static void main(String[] args) {
		
		s1();
		System.out.println(a);
		//P1 p1 =new P1();
	}
}
