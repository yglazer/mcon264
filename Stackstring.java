package LinkedListADTStack;

public class Stackstring {
	public static void main(String [] args) {
		LinkedListStack <String> ls=new LinkedListStack();
		ls.push("Joe");
		ls.push("Mo");
		ls.push("Yo");
		ls.push("Vo");
		//I should have 4 elements
		System.out.println("This is the amount of elements:");
		System.out.println(ls.size());
		
		ls.pop();
		//now I should have 3
		System.out.println("This is the amount of elements:");
		System.out.println(ls.size);
		
		ls.pop();
		ls.pop();
		//to check if it is popping well
		System.out.println("I am peeking:");
		System.out.println(ls.peek());
		
		ls.push("Toe");
		//to check if it pushed properly 
		System.out.println("I am peeking:");
		System.out.println(ls.peek());
	}
	
}
