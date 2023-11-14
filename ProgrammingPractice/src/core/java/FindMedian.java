package core.java;

import java.util.Arrays;

public class FindMedian {
	public static int find_median(int[] v) {
		Arrays.sort(v);
	        if(v.length%2 != 0){
				return v[(v.length / 2)];
	        }
	        else{
	            return  (v[((v.length)/2)]+v[(((v.length)/2)-1)])/2;
	            
	        }
	    }

		public static void main(String[] args) {
			int[] n = { 90, 100, 78, 89, 67, 80 };
			System.out.println(find_median(n));
}
}

