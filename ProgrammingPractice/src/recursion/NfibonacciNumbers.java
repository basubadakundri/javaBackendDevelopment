package recursion;

public class NfibonacciNumbers {

	public static void main(String[] args) {
		System.out.println(fibonacci(5));
	}

	private static int fibonacci(int i) {
		if (i <= 1) {
			return i;
		} else
			return fibonacci(i - 1) + fibonacci(i - 2);
	}

}
