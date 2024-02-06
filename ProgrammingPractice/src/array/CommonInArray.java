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

		for (int i = 0; i < array1.length; i++) {
			arrSet.add(array1[i]);
		}
		for (int j = 0; j < array2.length; j++) {
			if (arrSet.contains(array2[j])) {
				System.out.print(array2[j] + " ");
			}

		}


	}

	static String checkUnion(int[] array1, int[] array2) {
		Set<Integer> arrSet = new HashSet<>();

		for (int i = 0; i < array1.length; i++) {
			arrSet.add(array1[i]);
		}
		for (int j = 0; j < array2.length; j++) {
			if (arrSet.contains(array2[j])) {
				arrSet.remove(array2[j]);
			}
			else {
				arrSet.add(array2[j]);
			}

		}
		return arrSet.toString();
	}
}
