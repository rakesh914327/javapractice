package typeCasting;

public class B extends A{
	
	int b = 200;
	
	public void m1() {
		
		System.out.println("Hi from B Class m1");
		
	}
	public static void m2() {
		
		System.out.println("Hi From B class m2");
		
	}
	public static void main(String[] args) {
		
		A a = new B();
		
		a.m1();
		System.out.println(a.a);
		
		B b = (B) a;
		
		System.out.println(b.b);
		System.out.println(b.a);
		b.m2();
		
		
	}
	

}
