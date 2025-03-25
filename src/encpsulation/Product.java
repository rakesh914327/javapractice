package encpsulation;

public class Product {
	String productName;
	double price;
	int id;
	boolean inStock;
	
	public String getProductName() {
		return productName;
	}
	public double getPrice() {
		return price;
	}
	public int getId() {
		return id;
	}
	public boolean getInStock() {
		return inStock;
	}
	public void setProductName(String productName)
	{
		this.productName=productName;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public void setInStock(boolean inStock)
	{
		this.inStock=inStock;
	}

}
