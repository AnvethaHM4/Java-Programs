//3.Write a java program for getting different colors through ArrayList interface and sort them
//using Collections.sort( ArrayListObj)
      import java.util.ArrayList;
import java.util.Collections;

public class ColorSorter {
    public static void main(String[] args) {
        // Create an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();

        // Add colors to the list
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("Purple");

        // Print colors before sorting
        System.out.println("Colors before sorting: " + colors);

        // Sort the colors using Collections.sort()
        Collections.sort(colors);

        // Print colors after sorting
        System.out.println("Colors after sorting: " + colors);
    }
}
