package genericArray ;

import java.util.Arrays;

public class ArrayDemo{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main (String[]args) {
		//creates array
		GenericArray arrint= new GenericArray(5);
		//puts int values in array 
		arrint.set(0, 5);
		arrint.set(1,8);
		arrint.set(2, 6);
		arrint.set(3, 2);
		arrint.set(4,3);
		
		//Prints array
		printArray(arrint);
		
		
		//modifies the array
		arrint.set(0, 9);
		arrint.set(3,4 );
		
		
		//Prints modified array
		printArray(arrint);
		
		
		//Checks if empty and returns size 
		if (arrint.isEmpty()) {
			System.out.println("Array is empty");
		}else {
			System.out.println("Array has elements.");
			System.out.println("Size:"+arrint.size());
		}
		
	
		//creates array
		GenericArray arrstring= new GenericArray(5);
		//puts String values in array 
		arrstring.set(0, "Etti");
		arrstring.set(1,"Shifra");
		arrstring.set(2, "Chayala");
		arrstring.set(3, "Menachem");
		arrstring.set(4,"Yaakov Yechiel");
		
		//Prints array
		printArray(arrstring);
		
		
		//modifies the array
		arrstring.set(0, "Etti and Yaakov");
		arrstring.set(3,"Menachem and Rivka Brocha" );
		
		
		
		//Prints modified array
		printArray(arrstring);
		
		
		//Checks if empty and returns size 
		if (arrstring.isEmpty()) {
			System.out.println("Array is empty");
		}else {
			System.out.println("Array has elements.");
			System.out.println("Size:"+arrstring.size());
		}}
	
	
	
	
	public static void printArray(GenericArray array) {
		for(int i=0;i<array.size();i++) {
			System.out.println(array.get(i));
		}
	}
			
		
}