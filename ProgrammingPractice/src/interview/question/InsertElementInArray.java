package interview.question;

import java.util.ArrayList;

public class InsertElementInArray {

	public static void main(String[] args) {
		int[] arr = { 2, 8, 0, 9, 1, 7 };
		int elem = 3;
		int pos = 2;

		ArrayList<Integer> arrList = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (i == pos) {
				arrList.add(elem);

			}
			arrList.add(arr[i]);
		}
		System.out.println(arrList);

	}

}
