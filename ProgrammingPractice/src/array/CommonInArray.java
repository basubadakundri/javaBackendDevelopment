package array;

import java.util.HashSet;
import java.util.Set;

public class CommonInArray {

	public static void main(String[] args) {
		int[] array1 = { 15, 27, 8, 41, 92 };
		int[] array2 = { 8, 21, 35, 41, 67 };
		check(array1, array2);
		System.out.println(checkUnion(array1, array2));
	}

	static void check(int[] array1, int[] array2) {
		Set<Integer> arrSet = new HashSet<>();

		for (int element : array1) {
			arrSet.add(element);
		}
		for (int element : array2) {
			if (arrSet.contains(element)) {
				System.out.print(element + " ");
			}

		}


	}

	static String checkUnion(int[] array1, int[] array2) {
		Set<Integer> arrSet = new HashSet<>();

		for (int element : array1) {
			arrSet.add(element);
		}
		for (int element : array2) {
			if (arrSet.contains(element)) {
				arrSet.remove(element);
			}
			else {
				arrSet.add(element);
			}

		}
		return arrSet.toString();
	}
}
