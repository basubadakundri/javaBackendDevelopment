package string;

public class SpecialCharInString {

	public static void main(String[] args) {
		String str = "hello# _23";
		findSpecialChar(str);
		removeSpecialChar(str);
	}

	private static void removeSpecialChar(String str) {
		char[] ch = str.toCharArray();
		String newStr = "";
		for (char element : ch) {
			if (Character.isDigit(0) || Character.isLetter(element) || Character.isWhitespace(element)) {
				newStr = newStr + element;
			}
		}
		System.out.println("String Without Special Character: " + newStr);
	}

	private static void findSpecialChar(String str) {
		char[] ch = str.toCharArray();
		String newStr = "";
		for (char element : ch) {
			if (!Character.isDigit(0) && !Character.isLetter(element) && !Character.isWhitespace(element)) {
				newStr = newStr + element;
			}
		}
		System.out.println(newStr);
		newStr.indexOf("xy");
	}

}
