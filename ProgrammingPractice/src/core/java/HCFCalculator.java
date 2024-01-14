package core.java;

import java.util.Scanner;

public class HCFCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate and display the HCF
        int hcf = findHCF(num1, num2);
        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);

        // Close the scanner
        scanner.close();
    }

    // Function to find the HCF using the Euclidean algorithm
    private static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

