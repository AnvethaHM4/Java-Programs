//Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function capitalizeWords()

import java.util.Scanner;

public class CapitalizeWords {

    // User-defined function to capitalize the first letter of each word
    public static String capitalizeWords(String str) {
        // Split the string into words
        String[] words = str.split("\\s+");
        
        StringBuilder result = new StringBuilder();
        
        // Iterate through each word
        for (String word : words) {
            // Capitalize the first letter and keep the rest of the word in lowercase
            if (!word.isEmpty()) {
                result.append(word.substring(0, 1).toUpperCase())
                      .append(word.substring(1).toLowerCase())
                      .append(" ");
            }
        }
        
        // Remove the trailing space and return the result
        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Capitalize words using the user-defined function
        String result = capitalizeWords(input);

        // Display the result
        System.out.println("String with capitalized words: " + result);

        scanner.close();
    }
}
