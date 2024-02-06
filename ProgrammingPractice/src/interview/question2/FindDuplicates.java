package interview.question2;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 2, 5, 6, 7, 8, 8 };
		findDuplicate(arr);
	}

	private static void findDuplicate(int[] arr) {
		Set<Integer> newArray = new HashSet<>();

		for (int num : arr) {
			if (!newArray.add(num)) {
				System.out.print(num + " ");
			}
		}

	}

}
