package collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindDublicateInList {

	public static void main(String[] args) {
		List<Character> list = new ArrayList<>(List.of('c', 'a', 'c', 'a', 'b'));

		// 1 solution
//		List<Character> newList = new ArrayList<>();
//		List<Character> dubList = new ArrayList<>();
//		for (int i = 0; i < list.size(); i++) {
//			if (!newList.contains(list.get(i))) {
//				newList.add(list.get(i));
//			} else {
//				dubList.add(list.get(i));
//			}
//		}
//		System.out.println("Without dublicate Element" + newList);
//		System.out.println("Dublicate Element in array: " + dubList);

		// 2 solution
		Set<Character> set = new LinkedHashSet();

		for (char c : list) {
			if (!set.add(c)) {
				System.out.print(c + " ");
			}
		}

	}

}
