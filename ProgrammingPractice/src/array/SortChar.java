package array;

import java.util.Arrays;

public class SortChar {

	public static void main(String[] args) {
		String text = "basavaraj";
		System.out.println(sort(text));
	}

	static public String sort(String text) {
		String sorted = text;
		char[] arr = sorted.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}
}
