package core.java;

public class AverageOfNumbers {

	public static void main(String[] args) {
		// This program is to find the average of given number return as string with 2
		// decimal digits
		int[] A = { 1, 2, 3, 4, 5 };
		System.out.println(average(A, 5));
	}

	static String average(int A[], int N) {
		double sum = 0;
		for (int i : A) {
			sum = sum + i;
		}
		String formattedString = String.format("%.2f", sum);
		return formattedString;
	}
}
