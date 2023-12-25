package geeksforgeeks;

import java.util.Arrays;

/**
 * Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m. Task is to
 * check whether a2[] is a subset of a1[] or not. Both the arrays can be sorted
 * or unsorted. There can be duplicate elements.
 **/
public class CheckArraySubSetOfAnotherArray {
	public static void main(String[] args) {
		long a1[] = {11, 7, 1, 13, 21, 3, 7, 3};
		long a2[] = { 11, 3, 7, 1, 7 };
		System.out.println(isSubset(a1, a2, a1.length, a2.length));
	}

	public static String isSubset(long a1[], long a2[], long n, long m) {
		Arrays.sort(a1);
		Arrays.sort(a2);
		if (a1.length != 0 || a2.length != 0) {
			if (a1.length > a2.length) {
				return check(a1, a2);
			} else {
				return check(a2, a1);
			}

		} else
			return "No";
	}

	static String check(long[] x, long[] y) {
		for (int i = 0; i < y.length; i++) {
			if (x[i] != y[i]) {
				return "No";
			}
		}
		return "Yes";
	}

}
