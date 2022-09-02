
public class Ac {
	private String brand;
	private int price;
	private boolean isInverted;
	
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
	
	public void setIsInverted(boolean isInverted) {
		this.isInverted=isInverted;
	}
	public boolean getIsInverted() {
		return isInverted;
	}
	
	public Ac(String brand, int price, boolean isInverted) {
		this.brand=brand;
		this.price=price;
		this.isInverted=isInverted;
	}
	
	public String toString() {
		return "BRAND: "+brand+", PRICE: "+price+", ISINVERTED: "+isInverted;
	}

}
