package yg;

public class ReverseString {
	public static void main(String[]args){
		String original="Hello";
		String reversedString="";
		int index= original.length()-1;
		int i=0;
		reverse(index,reversedString,original);
	}
	public static void reverse(int index,String reversedString,String original) {
		if (index<0) {
			System.out.println(reversedString);
			System.out.println("Were done. Bye Bye!");
			return;
		}
		
		char letter= original.charAt(index);
		reversedString+=letter;
		
		reverse(index-1,reversedString,original);
	}
}
