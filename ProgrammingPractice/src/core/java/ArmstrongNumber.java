package core.java;

public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println(armstrongNumber(371));

	}

	static String armstrongNumber(int n) {
		int len = 0;
		int sum = 0;
		int N = n;
		while (N > 0) {
			len++;
			N = N / 10;
		}
		N = n;
		while (N > 0) {
			double power = Math.pow(N % 10, len);
			sum += power;
			N = N / 10;
		}
		if (n == sum) {
			return "yes";
		} else {
			return "no";
		}
	}
}
