package learning;

public class Demo {

	private Demo() {

		System.out.println("Hi from Constructor");
	}

	public void m1() {
		System.out.println("holaa!!!!!!!");
	}

	public static Demo getInstance() {
		Demo d = new Demo();

		return d;
	}

}
