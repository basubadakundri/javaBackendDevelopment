package interview.question;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentInfoCollector {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
		String name = "basavaraj";
		String mobileNumber = "7353870653";
		String dobString = "29/11/2000";
		Date dob = parseDate(dobString);
		String email = "basubadakundri@gmail.com";
		String sslcPassedDateString = "15/04/2020";
		Date sslcPassedDate = parseDate(sslcPassedDateString);
		String pucPassedDateString = "13/04/2023";
		Date pucPassedDate = parseDate(pucPassedDateString);

		// Collecting student information
//		System.out.println("Enter Student Information:");
//
//		System.out.print("Name: ");
//		String name = scanner.nextLine();
//
//		System.out.print("Mobile Number: ");
//		String mobileNumber = scanner.nextLine();
//
//		System.out.print("DOB (dd/MM/yyyy): ");
//		String dobString = scanner.nextLine();
//		Date dob = parseDate(dobString);
//
//		System.out.print("Email: ");
//		String email = scanner.nextLine();
//
//		System.out.print("SSLC/SSC Passed Date (dd/MM/yyyy): ");
//		String sslcPassedDateString = scanner.nextLine();
//		Date sslcPassedDate = parseDate(sslcPassedDateString);
//
//		System.out.print("PUC/12th Passed Date (dd/MM/yyyy): ");
//		String pucPassedDateString = scanner.nextLine();
//		Date pucPassedDate = parseDate(pucPassedDateString);

		// Checking eligibility
		if (isEligible(dob, sslcPassedDate, pucPassedDate)) {
			System.out.println("Congratulations! You are eligible for admission.");

			// Storing information in a text file
			storeInTextFile(name, mobileNumber, dobString, email, sslcPassedDateString, pucPassedDateString);
		} else {
			System.out.println("Sorry, you are not eligible for admission.");
		}

//		scanner.close();
	}

	private static Date parseDate(String dateString) {
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			return dateFormat.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	private static boolean isEligible(Date dob, Date sslcPassedDate, Date pucPassedDate) {
		// Age check
		int age = calculateAge(dob);
		

		// SSLC/SSC passed date check
		// PUC/12th passed date check
		if (age < 18 || age > 25 || !isDateInRange(sslcPassedDate, 1, 5) || !isDateInRange(pucPassedDate, -1, 0)) {
			return false;
		}

		return true;
	}

	private static int calculateAge(Date dob) {
		Date currentDate = new Date();
		long diff = currentDate.getTime() - dob.getTime();
		return (int) (diff / (1000L * 60 * 60 * 24 * 365));
	}

	private static boolean isDateInRange(Date date, int minDifference, int maxDifference) {
		Date currentDate = new Date();
		long diff = currentDate.getTime() - date.getTime();
		int yearsDifference = (int) (diff / (1000L * 60 * 60 * 24 * 365));

		return yearsDifference >= minDifference && yearsDifference <= maxDifference;
	}

	private static void storeInTextFile(String name, String mobileNumber, String dob, String email,
			String sslcPassedDate, String pucPassedDate) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("student_info.txt"))) {
			writer.write("Name: " + name);
			writer.newLine();
			writer.write("Mobile Number: " + mobileNumber);
			writer.newLine();
			writer.write("DOB: " + dob);
			writer.newLine();
			writer.write("Email: " + email);
			writer.newLine();
			writer.write("SSLC/SSC Passed Date: " + sslcPassedDate);
			writer.newLine();
			writer.write("PUC/12th Passed Date: " + pucPassedDate);
			writer.newLine();
			System.out.println("Student information stored in student_info.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
