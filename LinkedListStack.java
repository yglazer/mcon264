package LinkedListADTStack;

import java.util.EmptyStackException;

public class LinkedListStack<T>{
	
	private Node<T> head;
	int size;

	public class Node <T>{
			
			//Fields
			T value;
			Node next;
			
			
			Node(T value){
				this.value=value;
				this.next=null;
			}}
	public LinkedListStack() {
		head=null;
		size=0;}
	
	public void push(T value) {
		Node<T> newnode= new Node(value);
		newnode.next=head;
		head=newnode;
		size++;
	}
	public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T popped = head.value;
        head = head.next;
        size--;
        return popped;
    }
	public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return head.value;
    }
	public boolean isEmpty() {
        return head == null;
    }
	public int size() {
        return size;
    }
	}
	
	
	
	