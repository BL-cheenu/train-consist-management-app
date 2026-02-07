/**
 * UC19 – Binary Search for Bogie ID
 *
 * Hint:
 * - Store bogie IDs in a sorted array.
 * - Define the key to search.
 * - Use low, high, and mid-indices.
 * - Compare mid-element with key using compareTo().
 * - Update search range until element is found.
 *
 * @author Developer
 * @version 19.0
 */
public class TrainApp {

    public static void main(String[] args) {

        // Sorted array of bogie IDs
        String[] bogieIds = {"BG101", "BG102", "BG103", "BG104"};

        // Bogie ID to search
        String key = "BG103";

        // Initialize search boundaries
        int low = 0;
        int high = bogieIds.length - 1;

        // Boolean flag to track search result
        boolean found = false;

        // Perform binary search
        while (low <= high) {

            // Calculate middle index
            int mid = (low + high) / 2;

            // Compare middle element with search key
            int result = bogieIds[mid].compareTo(key);

            if (result == 0) {
                // Element found
                found = true;
                break;

            } else if (result < 0) {
                // Search in right half
                low = mid + 1;

            } else {
                // Search in left half
                high = mid - 1;
            }
        }

        // Display search result
        System.out.println("Found: " + found);
    }
}
