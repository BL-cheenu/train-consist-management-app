import java.util.Arrays;

/**
 * UC17 – Sort Bogie Names Using Arrays.sort()
 *
 * Hint:
 * - Store bogie names in a String array.
 * - Use Arrays.sort() to sort names alphabetically.
 * - Display the sorted array using Arrays.toString().
 *
 * @author Developer
 * @version 17.0
 */
public class TrainApp {

    public static void main(String[] args) {

        // Array containing bogie names
        String[] bogieTypes = {"Sleeper", "AC Chair", "First Class"};

        // Sort bogie names alphabetically using built-in sorting method
        Arrays.sort(bogieTypes);

        // Display the sorted bogie names
        System.out.println("Sorted Bogie Types: " + Arrays.toString(bogieTypes));
    }
}
