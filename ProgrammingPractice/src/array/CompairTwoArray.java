package array;

import java.util.Arrays;

public class CompairTwoArray {

	public static void main(String[] args) {
		int[] arr1 = { 3, 2, 5, 7 };
		int[] arr2 = { 2, 3, 7, 5 };

		Arrays.sort(arr1);
		Arrays.sort(arr2);

//		if (arr1.equals(arr2)) {
//			System.out.println("Both arrays are same: ");
//		} else {
//			System.out.println("Both arrays are not same");
//		}

		arrayCompair(arr1, arr2);
	}

	public static void arrayCompair(int[] arr1, int[] arr2) {
		boolean status = true;
		if (arr1.length != arr2.length) {
			status = false;
		} else {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					status = false;
				}
			}
		}
		if (status == true) {
			System.out.println("Both arrays are same");
		} else {
			System.out.println("Both arrays are not same");
		}
	}

}
