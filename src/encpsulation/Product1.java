package encpsulation;

public class Product1 {

	public static void main(String[] args) {
		Product p = new Product();
		p.setId(12);
		p.setInStock(true);
		p.setPrice(53000.00);
		p.setProductName("IQOO");
		System.out.println(p.getProductName());
		System.out.println(p.getId());
		System.out.println(p.getPrice());
		System.out.println(p.getInStock());
		

	}

}
