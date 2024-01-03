package yg;

import java.util.ArrayList;

public class Shopper {

	//Fields
	private String name;
	private ArrayList<Item> itemsPurchased;
	public int totalPurchaseValue;
	private int time;
	
	
	//creating a customer
	public Shopper(String name) {
		this.name = name;
		itemsPurchased = new ArrayList<> ();
		totalPurchaseValue = 0;
		
				
	}
	//buy item 
	public int addItem(Item wanted, int quantity) {
		itemsPurchased.add(wanted);
		int price = wanted.getPrice()*quantity;
		totalPurchaseValue =+ price;
		return price; 
	}
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Item> getItemsPurchased() {
		return itemsPurchased;
	}
	public void setItemsPurchased(ArrayList<Item> itemsPurchased) {
		this.itemsPurchased = itemsPurchased;
	}
	public int getTotalPurchaseValue() {
		return totalPurchaseValue;
	}
	public void setTotalPurchaseValue(int totalPurchaseValue) {
		this.totalPurchaseValue = totalPurchaseValue;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	     
}
