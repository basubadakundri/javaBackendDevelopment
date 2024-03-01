package interview.question;

public class EmailValidation2 {

	public static void main(String[] args) {
		String str = "basu@gmail.com";
		System.out.println(check(str));

	}

	static boolean check(String str) {

		if (!str.contains("@") || !str.contains(".") || (str.charAt(0) == '@')) {
			return false;
		}
		return true;
	}
}
