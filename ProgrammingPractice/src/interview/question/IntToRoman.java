package interview.question;

import java.util.LinkedHashMap;
import java.util.Map;

public class IntToRoman {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int number : numbers) {
		convertToRoman(number);
		}
	}

	public static void convertToRoman(int number) {
		Map<Integer, String> lm = new LinkedHashMap<>();
		lm.put(100, "C");
		lm.put(90, "XC");
		lm.put(50, "L");
		lm.put(40, "XL");
		lm.put(10, "X");
		lm.put(9, "IX");
		lm.put(5, "V");
		lm.put(4, "IV");
		lm.put(1, "I");

		StringBuilder sb = new StringBuilder();
		while (number > 0) {
			for (int i : lm.keySet()) {
				if (number >= i) {
					sb = sb.append(lm.get(i));
					number -= i;
			}
		}
	}
	System.out.println("Roman numeral for the given integer: " + sb);
}
}
