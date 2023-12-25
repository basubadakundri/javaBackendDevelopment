package core.java;

// Given a number, reverse it and add it to itself unless it becomes a palindrome
// or number of iterations becomes more than 5.
public class SumPalindrome {

	public static void main(String[] args) {
		System.out.println(isSumPalindrome(9772));
	}

	static long isSumPalindrome(long n) {
		long a = n;
		long iteration = 0;
		while (a != reverse(a) && iteration < 5) {
			a = a + reverse(a);
			iteration++;
		}
		if (a == reverse(a)) {
			return a;
		} else
			return -1;
	}

	static long reverse(long n) {
		long rev = 0;
		while (n > 0) {
			rev = rev * 10;
			rev = rev + n % 10;
			n = n / 10;
		}
		return rev;
	}

}
