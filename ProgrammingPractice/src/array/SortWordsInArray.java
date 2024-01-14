package array;

import java.util.Arrays;

public class SortWordsInArray {
	public static void main(String[] args) {
		String[] arr = { "hello", "Cbt", "Rat", "Rac", "Bat" };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

//	static public String[] sort(String[] list) {
//		Arrays.sort(list);
//		return list;
//	}
}
