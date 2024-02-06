package string;

public class StringIsogramCheck {

	public static void main(String[] args) {
		String str = "abcdefg";
		isIsogram(str);
	}

	public static void isIsogram(String str) {
		boolean status = true;
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if (sb.indexOf(String.valueOf(c)) > 0) {
				status = false;
				break;
			} else
				sb.append(c);
		}
		System.out.println(status);
	}
}
