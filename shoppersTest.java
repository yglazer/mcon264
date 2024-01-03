package yg;

import static org.junit.jupiter.api.Assertions.*;

import java.util.PriorityQueue;

import org.junit.jupiter.api.Test;

class shoppersTest {

	@Test
	void PriorityQueueMaintainingOrder() {
		Shop myShop = new Shop();
		Shopper a =myShop.addShopper("Yocheved");
		Shopper b = myShop.addShopper("Rivka");
		LineComparatorShopper lcs = new LineComparatorShopper();
		MyPriorityQueue <Shopper> line = new MyPriorityQueue <>(lcs);
		line.enqueue(a);
		line.enqueue(b);
		Shopper c = line.dequeue();
		assertEquals(c,a);
	}
	@Test
	void PriorityQueueMakingOrder() {
		Shop myShop = new Shop();
		Shopper a =myShop.addShopper("Yocheved");
		Shopper b = myShop.addShopper("Rivka");
		LineComparatorShopper lcs = new LineComparatorShopper();
		MyPriorityQueue <Shopper> line = new MyPriorityQueue <>(lcs);
		b.setTotalPurchaseValue(100);
		line.enqueue(a);
		line.enqueue(b);
		
		Shopper c = line.dequeue();
		assertEquals(c.getName(),b.getName());
	}
	@Test
	void PriorityQueueMakingOrder2() {
		Shop myShop = new Shop();
		Shopper a =myShop.addShopper("Yocheved");
		Shopper b = myShop.addShopper("Rivka");
		Shopper c = myShop.addShopper("Miriam");
		LineComparatorShopper lcs = new LineComparatorShopper();
		MyPriorityQueue <Shopper> line = new MyPriorityQueue <>(lcs);
		b.setTotalPurchaseValue(100);
		a.setTotalPurchaseValue(50);
		c.setTotalPurchaseValue(100);
		line.enqueue(a);
		line.enqueue(b);
		line.enqueue(c);
		
		Shopper d = line.dequeue();
		Shopper e = line.dequeue();
		assertEquals(d.getName(),b.getName());
		assertEquals(e.getName(),c.getName());
		
	}
	@Test
	void CheckoutTest() {
		Shop myShop = new Shop();
		Shopper a =myShop.addShopper("Yocheved");
		Shopper b = myShop.addShopper("Rivka");
		Shopper c = myShop.addShopper("Miriam");
		LineComparatorShopper lcs = new LineComparatorShopper();
		MyPriorityQueue <Shopper> line = new MyPriorityQueue <>(lcs);
		b.setTotalPurchaseValue(100);
		a.setTotalPurchaseValue(50);
		c.setTotalPurchaseValue(100);
		line.enqueue(a);
		line.enqueue(b);
		line.enqueue(c);
		
		Shopper d = line.dequeue();
		Shopper e = line.dequeue();
		assertEquals(100,b.getTotalPurchaseValue());
		
		
		
	}
	


}
