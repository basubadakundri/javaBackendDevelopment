package temp;

public class CountNumberOfDigit {

	public static void main(String[] args) {
		int i = 12345;
		int count = 0;
		// first solution
//		while (i > 0) {
//			count++;
//			i = i / 10;
//		}
		// second solution
		String str = String.valueOf(i);
		count = str.length();

		System.out.println("totle number of digit: " + count);
	}

}
