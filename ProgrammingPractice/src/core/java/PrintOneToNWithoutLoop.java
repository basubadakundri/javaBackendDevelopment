package core.java;

public class PrintOneToNWithoutLoop {

	public static void main(String[] args) {
		printNos(15);
	}

	public static void printNos(int N) {
		if (N > 0) {
			// Recursive call to printNos with the current number (N)
			System.out.print(N + " ");
			printNos(N - 1);

			// Print the current number
		}
	}
}
