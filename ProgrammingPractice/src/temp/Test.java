package temp;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(count("#GeeKs01fOr@gEEks07")));

}

	static int[] count(String s) {
		int[] arr = new int[4];
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (Character.isUpperCase(ch[i])) {
				arr[0] += 1;
			} else if (Character.isLowerCase(ch[i])) {
				arr[1] += 1;
			} else if (Character.isDigit(ch[i])) {
				arr[2] += 1;
			} else {
				arr[3] += 1;
			}
		}

		return arr;
	}
}
