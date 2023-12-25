package interview.question;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StudentInfoCollector2 {
    public static void main(String[] args) {
		String name = "Basavaraj";
		String mobileNumber = "7353870653";
		String birthdate = "2000-01-01";
		LocalDate dateOfBirth = parseDate(birthdate);
		LocalDate sslcPassedDate = parseDate("2019-04-15");
		String email = "basubadakundri@gmail.com";
		LocalDate pucPassedDate = parseDate("2021-04-17");

        // Validate eligibility
        if (isEligible(dateOfBirth, sslcPassedDate, pucPassedDate)) {
            System.out.println("Admission Eligible! Information will be stored.");

            // Store information in a text file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("student_info.txt"))) {
                writer.write("Name: " + name + "\n");
                writer.write("Mobile Number: " + mobileNumber + "\n");
                writer.write("Date of Birth: " + dateOfBirth + "\n");
                writer.write("SSLC/SSC Passed Date: " + sslcPassedDate + "\n");
                writer.write("Email: " + email + "\n");
                writer.write("PUC/12th Passed Date: " + pucPassedDate + "\n");
				writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("Admission Not Eligible!");
        }

    }

    private static LocalDate parseDate(String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(dateString, formatter);
    }

    private static boolean isEligible(LocalDate dateOfBirth, LocalDate sslcPassedDate, LocalDate pucPassedDate) {
        LocalDate currentDate = LocalDate.now();

        // Check age eligibility
        int age = currentDate.getYear() - dateOfBirth.getYear();
        if (age < 18 || age > 25) {
            return false;
        }

        // Check SSLC/SSC passed date eligibility
		long daysBetweenSSLC = currentDate.getYear() - sslcPassedDate.getYear();
        if (daysBetweenSSLC < 1 || daysBetweenSSLC > 5) {
            return false;
        }

        // Check PUC/12th passed date eligibility
		long daysBetweenPUC = currentDate.getYear() - pucPassedDate.getYear();
        return daysBetweenPUC >= 1 && daysBetweenPUC <= 5;
    }
}
