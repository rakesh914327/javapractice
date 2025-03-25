package basic;

public class Rectangle {
	
	public void area(int a,int b) {
		
		System.out.println("Area of Rectangle is :" + a*b);
		
	}
	public static void main(String[] args) {
		Shape s = new Shape();
		Rectangle r = new Rectangle();
		r.area(s.l, s.b);
	}

}
