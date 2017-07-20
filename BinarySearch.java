public class BinarySearch {
	
	public static void main(String [] args) {
		int [] arr = {1,3,5,7,9,11,13,15};
		int num = 6;
		
		//Change the function call to either use recursion or loop.
		int index = binarySearchRecur(arr, 0, arr.length-1, num);
			if (index == -1) 
				System.out.println(num + " not found");
			else
				System.out.println(num + " found at index " + index);
	}
	
	/*
	 * Recursive way of binary search
	 */
	static int binarySearchRecur(int [] arr, int left, int right, int num) {
		if (right >= left) {
			int mid = (left + right)/2;
			if (num == arr[mid])
				return mid;
			if (num < arr[mid])
				return binarySearchRecur(arr, left, mid -1, num);
			if (num > arr[mid])
				return binarySearchRecur(arr, mid+1, right, num);
		}
		return -1;
	}
	
	/*
	 * Iterative way of binary search
	 */
	static int binarySearchIter(int [] arr, int left, int right, int num) {
		while (right >= left) {
			int mid = (left + right)/2;
			if (num == arr[mid])
				return mid;
			if (num < arr[mid])
				right = mid -1;
			else 
				left = mid+1;
		}
		return -1;
	}
}