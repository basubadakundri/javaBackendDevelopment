package interview.question2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {
		int[] nums = { 1, 5, 3, 9, 7 };
		findSecondLargeNum(nums);
	}

	private static void findSecondLargeNum(int[] nums) {
		Set<Integer> newArray = new LinkedHashSet<>();
		Arrays.sort(nums);
		int[] arr2 = new[] int(4);
		for (int num : nums) {
			newArray.add(num);
		}
		newArray.stream().forEach(n );
		System.out.println("The Second Largest number in Array is: " + newArray);
	}

}
