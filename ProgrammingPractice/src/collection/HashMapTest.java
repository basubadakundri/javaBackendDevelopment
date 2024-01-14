package collection;

import java.util.HashMap;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "basavaraj");
		hm.put(2, "ram");
		hm.put(3, "Rahul");

		System.out.println(hm.get(1));
		System.out.println();
}
}
