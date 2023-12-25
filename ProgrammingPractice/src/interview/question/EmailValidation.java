package interview.question;

import java.util.Scanner;

public class EmailValidation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an email address: ");
		String email = scanner.nextLine();

		if (isValidEmail(email)) {
			System.out.println("Valid email address!");
		} else {
			System.out.println("Invalid email address!");
		}
	}

	private static boolean isValidEmail(String email) {
		// Check if the email is not null and not empty
		if (email == null || email.isEmpty()) {
			return false;
		}

		// Check if the email contains "@" and "."
		if (!email.contains("@") || !email.contains(".")) {
			return false;
		}

		// Check if "@" appears before "."
		if (email.indexOf("@") > email.lastIndexOf(".")) {
			return false;
		}

		// Check if "@" is not the first character
		if (email.indexOf("@") == 0) {
			return false;
		}

		// Check if "." is not the last character
		if (email.lastIndexOf(".") == email.length() - 1) {
			return false;
		}

		return true;
	}
}
