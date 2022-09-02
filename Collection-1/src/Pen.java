
public class Pen {
	private String brand;
	private int price;
	private int tax;
	private String color;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	
	public void setTax(int tax) {
		this.tax=tax;
	}
	public int getTax() {
		return tax;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	
	public Pen(String brand, int price, int tax, String color){
		this.brand=brand;
		this.price=price;
		this.tax=tax;
		this.color=color;
	}
	
	public String toString() {
		return "BRAND: "+brand+", PRICE: "+price+", TAX: "+tax+", COLOR: "+color;
	}
	

}
