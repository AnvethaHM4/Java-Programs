//Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined function isNumeric()
import java.util.Scanner;

public class NumericCheck {

    // User-defined function to check if the string contains only numeric characters
    public static boolean isNumeric(String str) {
        // Check if the string is not empty and contains only digits using regex
        return str != null && str.matches("\\d+");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Verify if the string contains only numeric characters
        if (isNumeric(input)) {
            System.out.println("The string contains only numeric characters.");
        } else {
            System.out.println("The string contains non-numeric characters.");
        }

        scanner.close();
    }
}
