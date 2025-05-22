//4.  Write a java program for getting different colors through ArrayList interface and extract the
//elements 1st and 2nd from the ArrayList object by using SubList()

        import java.util.ArrayList;
import java.util.List;

public class ColorExtractor {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        
        // Adding colors
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");

        // Display all colors
        System.out.println("All colors: " + colors);

        // Extracting 1st and 2nd elements using subList
        List<String> extracted = colors.subList(0, 2);

        // Display extracted colors
        System.out.println("Extracted (1st and 2nd) colors: " + extracted);
    }
}
