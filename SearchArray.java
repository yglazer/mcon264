package yg;

public class SearchArray {
	public static void main(String [] args) {
		int [] array = {1,2,3,4,5};
		int index=0;
		int searchNum=3;
		//going to the recursive function
		search(array, index, searchNum);
	}
	public static void search(int [] array, int index, int searchNum) {
		if (index==array.length-1) {
			System.out.println("Sorry not found");
			System.exit(0);
		}
		if (array[index]==searchNum) {
			System.out.println("Found at index:"+index);
			System.out.println("Were done. Bye Bye!");
			System.exit(0);
		}
		search(array, index+1, searchNum);
	}
}
