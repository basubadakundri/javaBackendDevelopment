package interview.question2;

import java.util.Arrays;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {
		int[] nums = { 1, 5, 3, 9, 7 };
		findSecondLargeNum(nums);
	}

	private static void findSecondLargeNum(int[] nums) {
		if (nums.length <= 2) {
			throw new IllegalArgumentException();
		}
		Arrays.sort(nums);
		int lar = nums[1];
		int secLarg = nums[0];
		for (int i = 2; i < nums.length; i++) {
			if (nums[i] > lar) {
				secLarg = lar;
				lar = nums[i];
			}
		}
		System.out.println("the second largest number is: " + secLarg);

	}

}
