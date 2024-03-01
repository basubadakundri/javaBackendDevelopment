package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckReverSortedArray {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(List.of(9, 8, 7, 6, 5, 4));

		checkSorted(list);
	}

	private static void checkSorted(List<Integer> list) {
		List<Integer> sorted = list;
		Collections.sort(sorted);
		List<Integer> reverseArr = new ArrayList<>();
		for (int i = (list.size() - 1); i >= 0; i--) {
			reverseArr.add(list.get(i));
		}
		System.out.println(sorted);
		System.out.println(reverseArr);
		if (sorted.equals(reverseArr)) {
			System.out.println("Array is sorted in decending order");
		} else {
			System.out.println("Array is not Sorted decending order");
		}
	}
}
