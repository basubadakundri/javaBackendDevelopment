package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindMissingNumbers {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 5, 7, 8, 10 };
//		findMissingNumber(arr);
		findMissingNumber2(arr);
	}

	private static void findMissingNumber2(int[] arr) {
		Set<Integer> set = new HashSet<>();
		for (int num : arr) {
			set.add(num);
		}
		Arrays.sort(arr);
		for (int i = arr[0]; i < arr[arr.length - 1]; i++) {
			if (!set.contains(i)) {
				System.out.println(i);
			}
		}

	}

	private static void findMissingNumber(int[] arr) {
		Arrays.sort(arr);
		int rise = 0;
		for (int i = arr[0]; i < arr[arr.length - 1]; i++) {
			if (i != arr[rise]) {
				System.out.println(i);
			} else
				rise++;

		}
	}
}
