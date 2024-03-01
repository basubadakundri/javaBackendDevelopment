package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringSortWithFrequencyOfOccurance {

	public static void main(String[] args) {
		getfreq("banana");
	}

	private static void getfreq(String str) {
		char[] ch = str.toCharArray();
		Map<Character, Integer> hm = new HashMap<>();
		for (char c : ch) {
			if (hm.containsKey(c)) {
				hm.put(c, (hm.get(c) + 1));
			} else {
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
		Set<Character> keyValue = hm.keySet();
		Collection<Integer> c = hm.values();
		System.out.println(keyValue);

	}

}
