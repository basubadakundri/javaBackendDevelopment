package string;

import java.util.Map;
import java.util.TreeMap;

public class StringCheck {

	public static void main(String[] args) {
		String str = "Learn with Krishna Sandeep";
		countWorld(str);
		checkVowel(str);
		charFrequency(str);
		upperCaseCount(str);
	}

	private static void upperCaseCount(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				count++;
			}
		}
		System.out.println("Total Uppercase letter in the string: " + count);
	}

	private static void charFrequency(String str) {
		Map<Character, Integer> map = new TreeMap<>();
		str = str.toLowerCase();
		str = str.replace(" ", "");
		for (int i = 0; i < str.length(); i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), (map.get(str.charAt(i)) + 1));
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		System.out.println(map);
	}

	private static void checkVowel(String str) {
		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.print(str.charAt(i) + " ");
				break;
			}
		}
		System.out.println();
	}

	private static void countWorld(String str) {
		String[] arr1 = str.split(" ");
		System.out.println("Word count in this String: " + arr1.length);
	}

}
