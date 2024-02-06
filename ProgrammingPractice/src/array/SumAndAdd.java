package array;

public class SumAndAdd {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		calculate(arr);
	}

	public static void calculate(int[] arr) {

		int sum = 0;
		for (int num : arr) {
			sum = sum + num;
		}
		for (int num : arr) {
			System.out.print((num + sum) + " ");
		}
	}
}
