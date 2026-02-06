import java.util.*;

/**
 * UC8 – Filter Passenger Bogies Using Streams
 *
 * Hint:
 * - Create a Bogie class with name and capacity.
 * - Store bogie objects in a List.
 * - Convert the list into a stream.
 * - Use filter() to select bogies with capacity greater than 60.
 * - Collect the result and display the filtered bogies.
 *
 * @author Developer
 * @version 8.0
 */

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

        // Create list of bogie objects
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 64)
        );

        // Filter bogies with capacity greater than 60 using Stream API
        List<Bogie> result = bogies.stream()
                .filter(b -> b.capacity > 60)
                .toList();

        // Display filtered bogies
        result.forEach(b -> System.out.println(b.name + " -> " + b.capacity));
    }
}
