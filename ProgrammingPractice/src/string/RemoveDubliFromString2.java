package string;

import java.util.HashSet;
import java.util.Set;

public class RemoveDubliFromString2 {

	public static void main(String[] args) {
		String st = "sandeep";
		System.out.println(removedupli(st));
	}

	private static String removedupli(String st) {
		Set<Character> newSt = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < st.length(); i++) {
			if (!newSt.contains(st.charAt(i))) {
				newSt.add(st.charAt(i));
				sb.append(st.charAt(i));
			}
		}
		return sb.toString();
	}

}
