package basic;

public class Lion implements Animal {

	public static void main(String[] args) {


		Lion l = new Lion();
		l.sound();

	}

	@Override
	public void sound() {


		System.out.println("Lion Roars");
		
	}

}
