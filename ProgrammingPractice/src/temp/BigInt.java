package temp;

import java.math.BigInteger;

public class BigInt {
	public static void main(String[] args) {
		BigInteger bg = new BigInteger("2");

		for (int i = 2; i < 64; i++) {
			bg = bg.multiply(bg);
		}
		System.out.println(bg);
	}
}
