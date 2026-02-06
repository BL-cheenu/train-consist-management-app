import java.util.SortedSet;
import java.util.TreeSet;

/**
 * UC4 – Maintain Ordered Bogie IDs using TreeSet
 *
 * This program demonstrates how TreeSet automatically
 * stores bogie IDs in sorted order.
 *
 * @author Developer
 * @version 4.0
 */

/**
 * Hint:
 * - Create a TreeSet to store bogie IDs.
 * - Add multiple bogie IDs to the collection.
 * - Display the bogie IDs and observe that they are sorted automatically.
 */
public class TrainApp {

    public static void main(String[] args) {

        // Create a TreeSet to store bogie IDs in sorted order
        SortedSet<String> sortedBogies = new TreeSet<>();

        // Add bogie IDs (TreeSet automatically sorts them)
        sortedBogies.add("BG105");
        sortedBogies.add("BG101");
        sortedBogies.add("BG103");

        // Display the sorted bogie IDs
        System.out.println("Sorted Bogie IDs: " + sortedBogies);
    }
}
