//Q2. Write a Java Program for Counting how many times a substring appears in a main string using user defined function countOccurrences()
import java.util.Scanner;

public class SubstringCount {

    // User-defined function to count the occurrences of a substring in the main string
    public static int countOccurrences(String mainStr, String subStr) {
        int count = 0;
        int index = 0;
        // Loop to find all occurrences of the substring
        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length(); // Move index forward to search for the next occurrence
        }
        return count;
    }
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        // Prompt user for main string and substring
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();
        System.out.print("Enter the substring: ");
        String subString = scanner.nextLine();
        // Count occurrences using the user-defined function
        int result = countOccurrences(mainString, subString);
        // Display the result
        System.out.println("The substring '" + subString + "' appears " + result + " times in the main string.");

        scanner.close();
    }
}
