import java.util.HashSet;
import java.util.Set;

/**
 * UC3 – Track Unique Bogie IDs using HashSet
 *
 * This program demonstrates how HashSet ensures that
 * duplicate bogie IDs are not stored in the collection.
 */

/**
 * Hint:
 * - Create a HashSet to store bogie IDs.
 * - Add multiple bogie IDs including a duplicate value.
 * - Observe that duplicate entries are automatically ignored.
 * - Display the set to verify that only unique bogie IDs are stored.
 */
public class TrainApp {

    public static void main(String[] args) {
        // Create a HashSet to store unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs to the set
        bogieIds.add("BG101");   // First bogie ID
        bogieIds.add("BG102");   // Second bogie ID
        bogieIds.add("BG101");   // Duplicate ID (will be ignored automatically)

        // Display the set of unique bogie IDs
        System.out.println("Unique Bogie IDs: " + bogieIds);
    }
}
