package core.java;

import java.util.Arrays;

public class ArrayExcepTwoGreatestElements {

	public static void main(String[] args) {
		long[] a = { 2, 8, 7, 1, 5 };
		System.out.println(Arrays.toString(findElements(a, 5)));
	}

	static public long[] findElements(long a[], long n) {
		Arrays.sort(a);
		long[] arr = new long[(int) (n - 2)];
		for (int i = 0; i < n - 2; i++) {
			arr[i] = a[i];
		}
		return arr;
	}

}
