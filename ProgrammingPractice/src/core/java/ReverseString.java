package core.java;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(revStr("Hello"));

	}

	static String revStr(String S) {
		String rev = "";
		for (int i = S.length() - 1; i >= 0; i--) {
			rev = rev + S.charAt(i);
		}
		return rev;
	}
}
