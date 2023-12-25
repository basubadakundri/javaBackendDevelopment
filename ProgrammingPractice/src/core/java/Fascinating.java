package core.java;

public class Fascinating {
	public static void main(String[] args) {
		System.out.println(fascinating(879));
	}

	static boolean fascinating(long n) {
		String concatenated = n + "" + (n * 2) + (n * 3);

		for (char digit = '1'; digit <= '9'; digit++) {
			if (concatenated.indexOf(digit) == -1) {
				return false;
			}
		}

		return true;
	}
}
