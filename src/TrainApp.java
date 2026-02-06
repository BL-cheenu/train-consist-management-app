import java.util.ArrayList;
import java.util.List;

/**
 * TrainApp UC1 – Initialize Train and Display Consist Summary
 *
 * This class demonstrates a simple Java application that initializes
 * an empty train consist and displays the initial consist summary
 * including the current number of bogies.
 *
 * @author Developer
 * @version 1.0
 */


public class TrainApp  {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // Initialize empty train consist
        List<String> bogies = new ArrayList<>();

        // Display consist summary
        System.out.println("Initial Bogie Count: " + bogies.size());
    }
}
