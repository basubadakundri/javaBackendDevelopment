package interview.question.employeeCount;

public class IntegerToRoman {
	public static void main(String[] args) {
		System.out.println(intoRoman(352));
	}

	private static String intoRoman(int num) {
		StringBuffer sb = new StringBuffer();
		int[] number = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] value = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		if (num <= 0 || num > 3999) {
			throw new IllegalArgumentException();
		}

		for (int i = 0; i < number.length; i++) {
			while (num >= number[i]) {
				sb.append(value[i]);
				num -= number[i];

			}
		}

		return String.valueOf(sb);
	}

}
