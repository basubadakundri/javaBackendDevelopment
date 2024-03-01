package string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

	public static void main(String[] args) {
		String str = "abcdabcdefab";
		longestSubstring(str);
	}

	private static void longestSubstring(String str) {
		Set<Character> set = new HashSet<>();
		String longest = "";
		String overall = "";
		for(int i=0; i<str.length();i++) {
			if (set.contains(str.charAt(i))) {
				set.clear();
				longest = "";
			}
			set.add(str.charAt(i));
			longest += str.charAt(i);
			if (set.contains(str.charAt(i))) {
				if (longest.length() > overall.length()) {
					overall = longest;
				}
			}
		}
		System.out.println(overall);

	}

}
