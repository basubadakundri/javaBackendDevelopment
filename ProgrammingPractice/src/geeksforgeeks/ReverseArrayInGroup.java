package geeksforgeeks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ReverseArrayInGroup {
	public static void main(String[] args) {

	ArrayList<Integer> arr = new ArrayList<>(List.of(1, 2, 3, 4, 5));

	reverseInGroups(arr,arr.size(), 3);
}

static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
	// code here
	if (k > n)
		Collections.reverse(arr.subList(0, n));
	else {
		int m = n;
		int j = 0;
		while (m > k) {
			Collections.reverse(arr.subList(j, j + k));
			j += k;
			m -= k;
		}
		Collections.reverse(arr.subList(j, n));
	}
	System.out.println(arr);
}
}
