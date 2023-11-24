package core.java;

public class ReverseDigit {

	public static void main(String[] args) {
		System.out.println(reverse_digit(200));
	}

	static public long reverse_digit(long n) {
		long rev = 0;
		while (n > 0) {
			rev = rev * 10;
			rev = rev + (n % 10);
			n = n / 10;
		}
		return rev;
	}

}
