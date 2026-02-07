/**
 * UC18 – Linear Search for Bogie ID
 *
 * Hint:
 * - Store bogie IDs in an array.
 * - Define the bogie ID to search.
 * - Traverse the array sequentially.
 * - Compare each element with the search value.
 * - Display whether the bogie ID is found.
 *
 * @author Developer
 * @version 18.0
 */
public class TrainApp {

    public static void main(String[] args) {

        // Array storing bogie IDs
        String[] bogieIds = {"BG101", "BG102", "BG103"};

        // Bogie ID to search
        String searchId = "BG102";

        // Boolean flag to track search result
        boolean found = false;

        // Perform linear search by traversing array sequentially
        for (String id : bogieIds) {

            // Compare each element with the search ID
            if (id.equals(searchId)) {
                found = true;   // Mark as found
                break;          // Stop searching once found
            }
        }

        // Display search result
        System.out.println("Found: " + found);
    }
}
