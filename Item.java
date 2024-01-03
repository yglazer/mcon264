package yg;

public class Item {
	
	//Fields
	private String description;
	private int price;
	
	
	//Constructor
	public Item(String description, int price) {
		this.price = price;
		this.description = description;
	}
	
	
	//getters and setters
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
