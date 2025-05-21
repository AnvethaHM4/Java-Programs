//Q3. Write a Java Program for Reversing the characters in a string using user defined function reverseString().
import java.util.Scanner;

public class StringReversal {
    public static String reverseString(String str) {
        String reversed = "";
        
        // Loop through the string from the end to the beginning
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); // Append each character to the reversed string
        }
        
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse the string using the user-defined function
        String reversedString = reverseString(input);

        // Display the reversed string
        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }
}
