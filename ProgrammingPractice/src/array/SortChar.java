package array;

import java.util.Arrays;

public class SortChar {

	public static void main(String[] args) {
		String text = "basavaraj";
		sort(text);

	}

	static public void sort(String text) {
		String sorted = text;
		char[] arr = sorted.toCharArray();
		Arrays.sort(arr);
		System.out.println(String.valueOf(arr));
	}
}
