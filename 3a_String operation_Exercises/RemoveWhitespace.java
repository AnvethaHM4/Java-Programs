//Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined function removeWhitespace()
import java.util.Scanner;

public class RemoveWhitespace {

    // User-defined function to remove all whitespace characters from the string
    public static String removeWhitespace(String str) {
        // Replace all whitespace characters (spaces, tabs, newlines, etc.) with an empty string
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove whitespace using the user-defined function
        String result = removeWhitespace(input);

        // Display the result
        System.out.println("String without whitespace: " + result);

        scanner.close();
    }
}
