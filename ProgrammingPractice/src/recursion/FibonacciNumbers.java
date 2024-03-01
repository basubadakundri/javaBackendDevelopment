package recursion;

public class FibonacciNumbers {

	public static void main(String[] args) {
		int n = 10;
		for (int i = 0; i < n; i++) {
			System.out.println(fibonacci(i));
		}
	}

	private static int fibonacci(int i) {
		if (i <= 1) {
			return i;
		} else
			return fibonacci(i - 1) + fibonacci(i - 2);
	}

}
