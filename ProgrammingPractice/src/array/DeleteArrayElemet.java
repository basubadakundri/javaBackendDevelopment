package array;

import java.util.Arrays;

public class DeleteArrayElemet {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(result(arr, 3)));
	}

	public static int[] result(int[] arr, int n) {
		int[] newArr = new int[arr.length - 1];
		int index = 0;
		for (int element : arr) {
			if (element != n) {
				newArr[index] = element;
				index++;
			}
		}
		return newArr;
	}
}
