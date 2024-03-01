package recursion;

public class PrintToN {

	public static void main(String[] args) {
		print(10);
	}

	private static void print(int i) {
		if (i > 0) {

			print(i - 1);
			System.out.println(i);

	}
	}

}
