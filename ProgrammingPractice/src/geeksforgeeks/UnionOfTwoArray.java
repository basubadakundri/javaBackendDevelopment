package geeksforgeeks;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int[] b = { 1, 2, 3 };
		System.out.println(doUnion(a, a.length, b, b.length));

	}

	public static int doUnion(int a[], int n, int b[], int m)
    {
       Set<Integer> uniqueset = new HashSet<>();
		for (int i : a) {
			uniqueset.add(i);
		}
		for (int i : b) {
			uniqueset.add(i);
		}
		return uniqueset.size();
	}
}
