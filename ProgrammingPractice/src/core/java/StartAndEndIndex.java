package core.java;

import java.util.Arrays;

public class StartAndEndIndex {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 5 };
		System.out.println(Arrays.toString(findIndex(a, 6, 5)));
	}

	static int[] findIndex(int a[], int N, int key)
    {
		int[] ans = { -1, -1 };
		for (int i = 0; i < N; i++) {
			if (a[i] == key) {
                ans[0]=i;
				break;
            }
        }
		for (int i = N - 1; i >= 0; i--) {
            if(a[i]==key){
                ans[1]=i;
				break;
            }
        }
        return ans;
    }

}
