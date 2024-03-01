package java8;

import java.util.Arrays;

public class SumOfTheAllElem {

	public static void main(String[] args) {
		int[] numbers = {2, 4, 6, 8, 9};
		int sum = Arrays.stream(numbers).sum();
		System.out.println("sum of the all element in array: " + sum);


	}

}
