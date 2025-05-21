//Q9. Write a Java Program for Creating a random string of a specified length using user defined function generateRandomString()
import java.util.Random;
import java.util.Scanner;

public class RandomStringGenerator {

    // User-defined function to generate a random string of specified length
    public static String generateRandomString(int length) {
        // Characters to choose from (uppercase, lowercase, and digits)
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder randomString = new StringBuilder();
        Random random = new Random();

        // Generate random characters from the characters string
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());  // Random index
            randomString.append(characters.charAt(index));  // Append character to result
        }

        return randomString.toString();  // Return the random string
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the desired length of the random string
        System.out.print("Enter the length of the random string: ");
        int length = scanner.nextInt();

        // Generate a random string using the user-defined function
        String randomStr = generateRandomString(length);

        // Display the generated random string
        System.out.println("Generated Random String: " + randomStr);

        scanner.close();
    }
}
