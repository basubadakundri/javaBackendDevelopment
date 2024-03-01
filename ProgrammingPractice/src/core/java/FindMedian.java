package core.java;

import java.util.Arrays;

public class FindMedian {
	public static int find_median(int[] v) {
		Arrays.sort(v);
	        if(v.length%2 != 0){
				return v[(v.length / 2)];
	        }
	        else{
				int middle1 = v[((v.length) / 2)];
				int middle2 = v[(((v.length) / 2) - 1)];
				return (middle1 + middle2) / 2;

	        }
	    }

		public static void main(String[] args) {
			int[] n = { 90, 100, 78, 89, 67, 80 };
			System.out.println(find_median(n));
}
}

