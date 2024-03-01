package string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringCompression {

	public static void main(String[] args) {
		String name = "sandeep";
		compression(name);
	}

	private static void compression(String name) {
		Map<Character, Integer> hm = new LinkedHashMap<>();
		for (int i = 0; i < name.length(); i++) {
			if (hm.containsKey(name.charAt(i))) {
				hm.put(name.charAt(i), (hm.get(name.charAt(i)) + 1));
			} else {
				hm.put(name.charAt(i), 1);
			}
		}
		System.out.println(hm);
		StringBuilder sb = new StringBuilder();
		for (Entry<Character, Integer> entry : hm.entrySet()) {
			sb.append(entry.getKey());
			sb.append(entry.getValue());
		}
		System.out.println(sb);

	}

}
