package abstraction;

public class Dog extends Mammal implements Animal {
	
	public void sleeing()
	{
		System.out.println("Dog is Sleeping");
	}
	public void makeSound() {
		System.out.println("Bavv... Bav...");
	}
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.sleep();
		d.makeSound();
	}

}
