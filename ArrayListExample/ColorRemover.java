//5.Write a java program for getting different colors through ArrayList interface and delete nth
//element from the ArrayList object by using remove by index
  import java.util.ArrayList;
import java.util.Scanner;

public class ColorRemover {
    public static void main(String[] args) {
        // Create an ArrayList and add colors
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");

        // Display the original list
        System.out.println("Original colors list: " + colors);

        // Get the n-th element to remove from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position (n) of the color to delete (1-based index): ");
        int n = scanner.nextInt();

        // Convert to 0-based index
        int indexToRemove = n - 1;

        // Check if index is valid
        if (indexToRemove >= 0 && indexToRemove < colors.size()) {
            // Remove the element
            String removedColor = colors.remove(indexToRemove);
            System.out.println("Removed color: " + removedColor);
        } else {
            System.out.println("Invalid position! Please enter a number between 1 and " + colors.size());
        }

        // Display the updated list
        System.out.println("Updated colors list: " + colors);
    }
}
