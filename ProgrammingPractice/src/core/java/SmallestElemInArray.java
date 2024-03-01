package core.java;

public class SmallestElemInArray {

	public static void main(String[] args) {
		int arry[] = {4,1,5,7,};

//		solution one
//		Arrays.sort(arry);
//        System.out.println(arry[0]);

//		Second solution
		int min = Integer.MAX_VALUE ;
		for (int element : arry) {
			if(element< min) {
				min = element;
			}
		}
		System.out.println(min);
	}

}
