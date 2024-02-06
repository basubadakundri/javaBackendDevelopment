package array;

public class BinarySort {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		System.out.println(find(arr, 15));
	}

	public static int find(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] > target) {
				end = mid - 1;

			} else {
				start = mid + 1;
			}
		}

		// Throwing an exception to indicate target not found
		throw new IllegalArgumentException("Target not found in the array");

	}
}
