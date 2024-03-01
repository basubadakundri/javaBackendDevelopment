package collection;

import java.util.HashMap;
import java.util.Map;

public class MejorityInArray {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 2, 3, 3, 3, 3 };
		findMejorElem(arr);
	}

	private static void findMejorElem(int[] arr) {
		Map<Integer, Integer> hm = new HashMap<>();
		for(int i :arr) {
			if(hm.containsKey(i)) {
				hm.put(i, hm.get(i)+1);
			}else{
				hm.put(i, 1);
			}
		}
		System.out.println(hm);
		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			if (entry.getValue() > 2) {
				System.out.println(entry.getKey());
			}
		}
	}

}
