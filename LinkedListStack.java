package LinkedListADTStack;

import java.util.EmptyStackException;

public class LinkedListStack<T>{
	//Fields
	//my pointer
	private Node<T> head;
	//enables it to be more efficent
	int size;
	
	//inner class unaccesible outside class
	 class Node <T>{
			
			//Fields
			T value;
			Node next;
			
			//constructor
			Node(T value){
				this.value=value;
				this.next=null;
	
			}}
	 //constructor
	public LinkedListStack() {
		head=null;
		size=0;}
	//moves head to point to new element
	public void push(T value) {
		Node<T> newnode= new Node(value);
		newnode.next=head;
		head=newnode;
		size++;
	}
	//checks if it is empty bc doesnt want to get null pointer
	public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        //pops the last one pushed
        T popped = head.value;
        head = head.next;
        size--;
        return popped;
    }
	//shows what the head is pointing to
	public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return head.value;
    }
	//tells us if stack is empty
	public boolean isEmpty() {
        return head == null;
    }
	//returns size
	public int size() {
        return size;
    }
	}
	
	
	
	