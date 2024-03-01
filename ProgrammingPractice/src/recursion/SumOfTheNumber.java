package recursion;

public class SumOfTheNumber {
	public static void main(String[] args) {
		System.out.println(sumOfTheDigit(5));
	}

	private static int sumOfTheDigit(int i) {
		if (i == 0 || i == 1) {
			return 1;
		} else {
			return i + sumOfTheDigit(i - 1);
		}
	}
}
