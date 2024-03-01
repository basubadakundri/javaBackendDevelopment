package core.java;

public class CheckForBinary {

	public static void main(String[] args) {
		System.out.println(isBinary("0111100110101100"));
	}

	static boolean isBinary(String str) {
		char[] arry = str.toCharArray();
		for (char element : arry) {
			if (element != '0' && element != '1') {
				return false;
			}

		}
		return true;
	}

}
