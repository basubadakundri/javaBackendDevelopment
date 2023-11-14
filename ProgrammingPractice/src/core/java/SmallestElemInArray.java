package core.java;

import java.util.Arrays;

public class SmallestElemInArray {

	public static void main(String[] args) {
		int arry[] = {4,1,5,7,};
	 
//		solution one
//		Arrays.sort(arry);
//        System.out.println(arry[0]);
		
//		Second solution
		int min = Integer.MAX_VALUE ;
		for(int i = 0; i<arry.length; i++) {
			if(arry[i]< min) {
				min = arry[i];
			}
		}
		System.out.println(min);
	}

}
