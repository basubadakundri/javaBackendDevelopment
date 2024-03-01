package string;

import java.util.Arrays;

public class SortCharInString {

	public static void main(String[] args) {
		String str = "hello";

		char[] charArr = str.toCharArray();
		Arrays.sort(charArr);
		String sortedStr = String.valueOf(charArr);
		String sortedStr2 = new String(charArr);
		System.out.println(sortedStr);
	}

}
