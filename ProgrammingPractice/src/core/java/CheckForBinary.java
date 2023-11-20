package core.java;

public class CheckForBinary {

	public static void main(String[] args) {
		System.out.println(isBinary("0111100110101100"));
	}

	static boolean isBinary(String str) {
		char[] arry = str.toCharArray();
		for (int i = 0; i < arry.length; i++) {
			if (arry[i] != '0' && arry[i] != '1') {
				return false;
			}

		}
		return true;
	}

}
