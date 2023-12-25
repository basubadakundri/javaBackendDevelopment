package core.java;

import java.util.Arrays;

public class StreamAvg {

	public static void main(String[] args) {
		int[] arr= {10, 20, 30, 40, 50};
		System.out.println(Arrays.toString(streamAvg(arr, 5)));
	}

	static float[] streamAvg(int[] arr, int n) {
		float[] avg = new float[n];
		for (int i = 0; i < n; i++) {
			float sum = 0;
			for (int j = 0; j <= i; j++) {
				sum = sum + arr[j];
			}
			avg[i] = sum / (i + 1);
		}
		return avg;
	}
}
