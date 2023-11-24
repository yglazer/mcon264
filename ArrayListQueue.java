package yg;

import java.util.ArrayList;
import java.util.List;
//I just took this from proffesors code
public class ArrayListQueue<T> implements QueueInterface<T> {
 private List<T> list;
 private int head;  // head of queue
 private int queueLen;  // end of current queue information

 // Constructor
 public ArrayListQueue() {
   list = new ArrayList<>();
   head = 0;
   queueLen = 0; 
 }

 @Override
 public void enqueue(T element) {
   list.add(element);
   queueLen++; 
 }

 
 /**
 The expression `head = (head + 1) % list.size();
 ensures that the head pointer iterates through the 
 indices of the list in a circular manner. 
 When `head` reaches the size of the current list, 
 the modulo operation `%` will result in 0, 
 resetting  `head` to zero, 
 **/
 
 @Override
 public T dequeue() {
   if (isEmpty()) {
     throw new IllegalStateException("Queue is empty");
   }
   T removed = list.get(head);
  
   head = (head + 1) % list.size();
   
   if (head == 0 ) {
	  queueLen = 0; 
   }
   
   return removed;
 }

 @Override
 public T peek() {
   if (isEmpty()) {
     throw new IllegalStateException("Queue is empty");
   }
   return list.get(head);
 }

 @Override
 public boolean isEmpty() {
   return list.isEmpty();
 }

 @Override
 public int size() {
   return list.size();
 }

 @Override
 public void clear() {
   list.clear();
   head = 0;
  }
 
 @Override
 public String toString() {
 	StringBuffer stringBuffer = new StringBuffer();
 	stringBuffer.append("These are the contents of the queue  head : \n" + head ); 
 	
 	for( int i=head ; i < queueLen; i++) {
 		if (list.get(i) != null) {
	    		stringBuffer.append(i); 
	    		stringBuffer.append(" : "); 
	    		stringBuffer.append(list.get(i)); 
	    		stringBuffer.append("\n"); 
	    		
 		}
 	}
 	return stringBuffer.toString();
 }
}
