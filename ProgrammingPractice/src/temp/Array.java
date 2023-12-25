package temp;

import java.util.ArrayList;

public class Array {
	public static void main(String[] args) {

		long[] arr1 = { 1, 5, 7, 8, 10 };
		long[] arr2 = { 8, 5, 2, 4 };
		merge(arr1, arr2, arr1.length, arr2.length);
	}

	static void merge(long arr1[], long arr2[], int n, int m) {
		ArrayList<Long> arrList = new ArrayList<>();
		for (long i : arr1) {
            arrList.add(i);
        }
		for (long j : arr2) {
			arrList.add(j);
        }
        
    }
}
