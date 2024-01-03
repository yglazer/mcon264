package yg;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Comparator and priority queue
		LineComparatorShopper lcs = new LineComparatorShopper();
		MyPriorityQueue <Shopper> line = new MyPriorityQueue <>(lcs);
		Shop myShop = new Shop();
		
		///creating the items in the shop and adding them to ArrayList 
		Item socks = new Item ("socks",5);
		Item shoes = new Item ("shoes",20);
		Item buttons = new Item ("buttons",1);
		Item siddur = new Item ("siddur",18);
		Item bandaids = new Item ("bandaids",4);
		myShop.addItem(bandaids);
		myShop.addItem(siddur);
		myShop.addItem(buttons);
		myShop.addItem(shoes);
		myShop.addItem(socks);
		
		
		//scanner
		Scanner k = new Scanner (System.in);
		
		//keep displaying menu and pick your choice
		//directory
		while(true) {
		Display.displayMenu();
		int choice = k.nextInt();
		k.nextLine();
		if (choice == 1) {
			enqueShopper(k,myShop, line);
		}
		else if (choice == 2) {
			dequeueShopper(line, k, socks, shoes, buttons, bandaids, siddur);
		}
		else if (choice == 3) {
			createShopper(k,myShop);
		}
		}
		
		
		
		
		

	}
	
	//create new shopper/cust
	private static void createShopper(Scanner k, Shop myShop) {
		System.out.println("What is the name of the new shopper?");
		String name = k.nextLine();
		Shopper a= myShop.addShopper(name);
		
		
		
		
	}

	//checkout process
	private static void dequeueShopper(MyPriorityQueue<Shopper> line, Scanner k,Item socks, Item shoes, Item button, Item bandaids, Item siddur) {
		Shopper a = line.dequeue();
		System.out.println(a.getName()+", it is your turn to purchase items");
		int coupon =0;
		int total = 0;
		int price =0;
		if (a.totalPurchaseValue>=20) {
			System.out.println("You get a coupon of one dollar because you are such a loyal customer");
			coupon = 1;
		}
		int again=1;
		while(again==1) {
		Display.displayItems();
		int choice = k.nextInt();
		System.out.println("What quantity?");
		int quantity = k.nextInt();
		k.nextLine();
		if (choice == 1) {
			price = a.addItem(socks, quantity);
		}
		else if (choice == 2) {
			price = a.addItem(shoes, quantity);
		}
		else if (choice == 3) {
			price = a.addItem(button, quantity);
		}
		else if (choice == 4) {
			price = a.addItem(bandaids, quantity);
		}
		else if (choice == 5) {
			price = a.addItem(siddur, quantity);
		}
		System.out.println("1. I want more items\n 2. All done");
		total += price;
		again = k.nextInt();
		k.nextLine();}
		System.out.println("Your total is: "+ total);
		if (coupon > 0) {
			System.out.println("You have a coupon of 1 dollar. It will be deducted fro your total");
			total -= coupon;
		}
		
	}


	

	//add shopper to line
	private static void enqueShopper(Scanner k, Shop myShop,MyPriorityQueue<Shopper> line) {
		System.out.println("What is the name of the shopper?");
		String name = k.nextLine();
		Shopper a = myShop.getShopper(name);
		line.enqueue(a);
		
		
	}


	

}
