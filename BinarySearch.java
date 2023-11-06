package yg;
public class BinarySearch {

	public class MainBinarySearch {

		public static void main(String[] args) {
			// sorted array
			int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
			//search number
			int search = 7;
			
			//System.out.println(nums.length);
			//goes to search method
			int answer = search(nums, search, 0, 9);
			//displays answer
			System.out.println("answer " + answer);

		}

		public static int search(int[] nums, int search, int start, int end) {
			
			//System.out.println("enter recursion: " + start + end);
			//gets the mid value of specified range
			int scan = ((end - start) / 2) + start;
			//System.out.println("scan:" + nums[scan]);
			//if found return
			if (nums[scan] == search) {

				//System.out.println("equals");

				return scan;

			}
			//to prevent array index out of bounds and kind of base case
			if (scan > nums.length - 2 || scan < 0) {

				return -1;
			//if scan is higher than search call to recursive
			} else if (nums[scan] > search) {

				//System.out.println("too high");

				return search(nums, search, start, scan - 1);
			//if scan is lower than search- call to recursive
			} else if (nums[scan] < search) {

				//System.out.println("too low");

				return search(nums, search, scan + 1, end);

			} else {

				return -1;

			}

		}

	}
}
