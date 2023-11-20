package core.java;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(is_palindrome(151));
	}

	static public String is_palindrome(int n) {
		int rev = 0;
		int num = n;
		while (num > 0) {
			rev = rev * 10;
			rev += num % 10;
			num = num / 10;
		}
		if (rev == n) {
			return "Yes";
		} else {
			return "No";
		}
	}
}
