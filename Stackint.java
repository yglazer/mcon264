package LinkedListADTStack;

public class Stackint {
	public static void main(String [] args) {
		LinkedListStack <Integer> ls=new LinkedListStack();
		ls.push(1);
		ls.push(2);
		ls.push(4);
		ls.push(6);
		//I should have elements
		System.out.println("This is the amount of elements:");
		System.out.println(ls.size());
		
		ls.pop();
		//now I should have 3
		System.out.println("This is the amount of elements:");
		System.out.println(ls.size);
		
		ls.pop();
		ls.pop();
		//to check if it popped properly
		System.out.println("I am peeking:");
		System.out.println(ls.peek());
		
		ls.push(100);
		//to check if it push properly
		System.out.println("I am peeking:");
		System.out.println(ls.peek());
	}
}
