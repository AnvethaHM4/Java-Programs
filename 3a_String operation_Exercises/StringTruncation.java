//Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user defined function truncate()
import java.util.Scanner;

public class StringTruncation {

    // User-defined function to truncate the string and add an ellipsis
    public static String truncate(String str, int length) {
        // If the string length is greater than the specified length, truncate it
        if (str.length() > length) {
            return str.substring(0, length) + "...";
        }
        // If the string is shorter or equal to the specified length, return it as is
        return str;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Prompt the user to enter the desired length
        System.out.print("Enter the length to truncate to: ");
        int length = scanner.nextInt();

        // Truncate the string using the user-defined function
        String result = truncate(input, length);

        // Display the truncated string
        System.out.println("Truncated string: " + result);

        scanner.close();
    }
}
