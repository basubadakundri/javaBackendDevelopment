package core.java;

public class CountOfSmallerElement {

	public static void main(String[] args) {
		long[] arr = { 1, 2, 4, 5, 8, 10 };
		System.out.println(countOfElements(arr, 6, 9));

	}

	static public long countOfElements(long arr[], long n, long x) {
		long max = -1;

		for (int i = 0; i < n; i++) {
			if (arr[i] <= x) {
				max = i;
			}
		}
		return max + 1;

	}

}
