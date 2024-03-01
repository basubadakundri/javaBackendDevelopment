package string;

public class AllSubString {

	public static void main(String[] args) {
		String str = "abc";
		subString(str);
	}

	private static void subString(String str) {
//		for (int i = 0; i < str.length(); i++) {
//			String temp = "";
//			for (int i = 0; i < str.length(); i++) {
//				temp += str.charAt(j);
//				System.out.println(temp);
//			}
//		}
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}

	}

}
