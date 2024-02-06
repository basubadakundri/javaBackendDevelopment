package array;
import java.util.ArrayList;
import java.util.List;
public class SortEvenOddSeparate {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 3, 7, 8, 11, 20 };
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				list.add(arr[i]);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				list.add(arr[i]);
			}
		}
		System.out.println("The new sorted array is: ");
		System.out.println(list);
	}


}
