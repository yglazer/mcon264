package yg;

public class SumOfDigits {
	public static void main (String [] args) {
		int [] array = {1,2,3,4,5};
		int total=0;
		sum(array, 0,total);
		
	}
		public static void sum(int [] array, int index,int total) {
			
			if (index==array.length) {
				System.out.println(total);
				System.out.println("Were done. Bye Bye!");
				System.exit(0);
			}
			
			total+=array[index];
			
			sum(array,index+1,total);
			
		}
	
}
