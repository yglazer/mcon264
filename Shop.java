package yg;

import java.util.ArrayList;
//Shop class
public class Shop {
	
	//ArrayList of customers and items
	ArrayList <Shopper> shoppers;
	ArrayList <Item> items;
	
	//constructor
	public Shop() {
		shoppers = new ArrayList<>();
		items = new ArrayList<>();
	}
	
	
	//Checkout process
	public void shopProcess(String name, Item wanted, int quantity) {
		Shopper current = null;
		for (Shopper s : shoppers) {
			if(s.getName().toLowerCase()==name.toLowerCase()) {
				current = s;
			}
		}
		if(current == null) {
			System.out.println("No shopper by that name");
		}else {
		current.addItem(wanted, quantity);
		
		}
		
		
	}
	
	//Find Shopper
	public Shopper getShopper(String name) {
		Shopper current = null;
		for (Shopper s : shoppers) {
			if(s.getName().toLowerCase()==name.toLowerCase()) {
				current = s;
			}
		}
		if(current == null) {
			System.out.println("No shopper by that name");
			return null;
		}else {
		return current;
		
		}
		
		
	}
	//add shopper
	public Shopper addShopper(String name) {
		Shopper newShopper = new Shopper (name);
		shoppers.add(newShopper);
		return newShopper;
	}
	//addItem to shop
	public void addItem(Item i) {
		items.add(i);
	}
}
