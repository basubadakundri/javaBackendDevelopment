package collection;

import java.util.ArrayList;
import java.util.List;

public class FindTheIntersection {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>(List.of(1, 3, 5, 7, 9));
		List<Integer> list2 = new ArrayList<>(List.of(2, 3, 5, 6, 8, 9));

		List<Integer> commonElem = new ArrayList<>();
		for (int num : list1) {
			if (list2.contains(num)) {
				commonElem.add(num);
			}
		}
		System.out.println(commonElem);
	}

}
