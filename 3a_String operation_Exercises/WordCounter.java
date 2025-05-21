
//Q10. Write a Java Program for Counting the number of words in a string using user defined function countWords()

import java.util.Scanner;

public class WordCounter {

    // User-defined function to count the number of words in a string
    public static int countWords(String str) {
        // Trim the string to remove leading and trailing spaces and split by one or more whitespace characters
        String[] words = str.trim().split("\\s+");

        // If the string is empty, return 0 (no words)
        if (str.isEmpty()) {
            return 0;
        }

        // Return the length of the array, which represents the number of words
        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Count the words using the user-defined function
        int wordCount = countWords(input);

        // Display the word count
        System.out.println("Number of words: " + wordCount);

        scanner.close();
    }
}
