package geeksforgeeks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ReverseArrayInGroup2 {
	public static void main(String[] args) {

	ArrayList<Integer> arr = new ArrayList<>(List.of(1, 2, 3, 4, 5));

	System.out.println(reverseInGroups(arr, arr.size(), 3));
}

static ArrayList<Integer> reverseInGroups(ArrayList<Integer> arr, int n, int k) {

	  if(n>k) {
			Collections.reverse(arr.subList(0, k));
			System.out.println(arr.subList(0, k));
			Collections.reverse(arr.subList(k, n));
			return arr;

	  }
	  else {
		 Collections.reverse(arr);
			return arr;
	  }
}
}
