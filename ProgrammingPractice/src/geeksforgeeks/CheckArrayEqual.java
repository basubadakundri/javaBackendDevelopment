package geeksforgeeks;

import java.util.Arrays;

public class CheckArrayEqual {

	public static void main(String[] args) {
		long a[] = { 1, 2, 3, 4, 5 };
		long[] b = { 5, 4, 3, 2, 1 };
		System.out.println(check(a, b, b.length));
	}

	public static boolean check(long A[], long B[], int N) {
		Arrays.sort(A);
		Arrays.sort(B);
		if(Arrays.equals(A, B)) {
			return true;
		}
		else
			return false;
	}
}
