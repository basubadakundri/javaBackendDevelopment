package interview.question;

public class SubArraySum {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4 };
		int k = 3;
		int result = 0;

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum = sum + arr[j];
				if (sum == k) {
				result++;
				}
			}
		}
		System.out.println("totle number of sub arry that sum of 3 is: " + result);
	}

}
