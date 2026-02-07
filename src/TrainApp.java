import java.util.*;
import java.util.stream.Collectors;

/**
 * UC13 – Performance Comparison (Loops vs Streams)
 *
 * Hint:
 * - Create a list of bogie objects.
 * - Measure execution time using System.nanoTime().
 * - Perform filtering using loop-based approach.
 * - Perform filtering using stream-based approach.
 * - Compare and display execution times.
 *
 * @author Developer
 * @version 13.0
 */

// Class representing a bogie
class Bogie {
    String name;
    int capacity;

    // Constructor to initialize bogie details
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class TrainApp {

    public static void main(String[] args) {

        // Create a large list of bogies for performance testing
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            bogies.add(new Bogie("Sleeper", 72));
        }

        // ---------------- Loop-based filtering ----------------

        // Record start time before loop execution
        long startLoop = System.nanoTime();

        // Create a list to store filtered bogies
        List<Bogie> loopResult = new ArrayList<>();

        // Filter bogies using traditional loop
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        // Record end time after loop execution
        long endLoop = System.nanoTime();

        // Display loop execution time
        System.out.println("Loop Time: " + (endLoop - startLoop));

        // ---------------- Stream-based filtering ----------------

        // Record start time before stream execution
        long startStream = System.nanoTime();

        // Filter bogies using Stream API
        List<Bogie> streamResult = bogies.stream().filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Record end time after stream execution
        long endStream = System.nanoTime();

        // Display stream execution time
        System.out.println("Stream Time: " + (endStream - startStream));
    }
}
