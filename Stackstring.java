package LinkedListADTStack;

public class Stackstring {
	public static void main(String [] args) {
		LinkedListStack <String> ls=new LinkedListStack();
		ls.push("Joe");
		ls.push("Mo");
		ls.push("Yo");
		ls.push("Vo");
		//I should have elements
		System.out.println("This is the amount of elements:");
		System.out.println(ls.size());
		
		ls.pop();
		//now I should have 3
		System.out.println("This is the amount of elements:");
		System.out.println(ls.size);
		
		ls.pop();
		ls.pop();
		System.out.println("I am peeking:");
		System.out.println(ls.peek());
		
		ls.push("Toe");
		System.out.println("I am peeking:");
		System.out.println(ls.peek());
	}

}
