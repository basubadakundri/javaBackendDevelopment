package core.java;

public class CountDigits {

	public static void main(String[] args) {
		System.out.println(evenlyDivides(22074));
	}
	static int evenlyDivides(int N) {
		int count = 0;
		int n = N;
		while (n > 0) {
			if (n % 10 != 0) {
				if (N % (n % 10) == 0) {
					count++;
				}
			}
			n = n / 10;
		}
		return count;
	}
}
