package collection;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(List.of(1, 4, 7, 6, 8));
		// 1 solution
//		Collections.reverse(list);

		// 2 solution
		List<Integer> newList = new ArrayList<>();
		for (int i = (list.size() - 1); i >= 0; i--) {
			newList.add(list.get(i));
		}
		System.out.println(newList);
	}

}
