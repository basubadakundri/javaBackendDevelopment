package core.java;

import java.util.Arrays;

public class SwapthKthElement {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		swapKth(arr, 8, 3);
	}

	static void swapKth(int arr[], int n, int k) {
			int temp = arr[k - 1];
			arr[k - 1] = arr[n - k];
			arr[n - k] = temp;
		System.out.println(Arrays.toString(arr));
	}
}
