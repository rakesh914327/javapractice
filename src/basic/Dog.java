package basic;

public class Dog implements Animal{

	public static void main(String[] args) {


		Dog d = new Dog();
		d.sound();

	}

	@Override
	public void sound() {
		
		System.out.println(" Dog Barks");
		
	}

}
