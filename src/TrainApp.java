import java.util.Arrays;

/**
 * UC16 – Sort Passenger Bogies by Capacity using Bubble Sort
 *
 * Hint:
 * - Store capacities in an array.
 * - Use nested loops for Bubble Sort.
 * - Compare adjacent elements and swap if needed.
 * - Display the sorted array.
 *
 * @author Developer
 * @version 16.0
 */
public class TrainApp {
    public static void main(String[] args) {
        // Array storing passenger bogie seating capacities
        int[] capacities = {72, 56, 24};

        // Outer loop controls the number of passes
        for (int i = 0; i < capacities.length - 1; i++) {
            // Inner loop compares adjacent elements
            for (int j = 0; j < capacities.length - i - 1; j++) {
                // Check if current element is greater than next element
                if (capacities[j] > capacities[j + 1]) {

                    // Swap elements using temporary variable
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
        // Display the sorted capacities
        System.out.println("Sorted Capacities: " + Arrays.toString(capacities));
    }
}
