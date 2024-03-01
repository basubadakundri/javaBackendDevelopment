package array;

import java.util.Arrays;

public class SortName {

	public static void main(String[] args) {
		String[] names = { "Banana", "Apple", "Cat", "Grapes", "Aapple" };
		// with sort method
//		Arrays.sort(names);
//		System.out.println(Arrays.toString(names));

//		sortWords(names);
		sortWords2(names);
	}

// better solution;
	private static void sortWords2(String[] names) {
		for (int i = 0; i < names.length - 1; i++) {
			for (int j = i + 1; j < names.length - 1; j++) {

				if (names[i].compareTo(names[j]) > 0) {
					String temp = names[i];
					names[i] = names[j + 1];
					names[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(names));
	}

	private static void sortWords(String[] names) {
		for (int i = 0; i < names.length - 1; i++) {
			for (int j = i + 1; j < names.length - 1; j++) {

				if (names[i].charAt(0) > names[j].charAt(0)) {
					String temp = names[i];
					names[i] = names[j + 1];
					names[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(names));
	}


}
