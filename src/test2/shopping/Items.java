package test2.shopping;

public class Items {
	 String  cat;
     String name;
     int quantity;
     float price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Items(String name, int quantity, float price , String cat) {
		super();
		this.cat=cat;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	public String getCat() {
		return cat;
	}
	public void setId(int id) {
		this.cat = cat;
	}
	@Override
	public String toString() {
		return "Items [Category=" + cat + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}
} 
