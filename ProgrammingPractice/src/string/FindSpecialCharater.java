package string;

public class FindSpecialCharater {

	public static void main(String[] args) {
		String str = "Sandeep@&12";
		check(str);
	}

	private static void check(String str) {
		System.out.println(Character.isLetter(str.charAt(0)));
		for(int i=0; i<str.length();i++) {
			char num = str.charAt(i);
			if (Character.isLetter(num) || Character.isDigit(num) || Character.isWhitespace(num)) {

			} else {
				System.out.println(num);
			}
		}
	}

}
