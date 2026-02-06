import java.util.*;
import java.util.stream.Collectors;

/**
 * UC9 – Group Bogies by Type using Collectors.groupingBy()
 *
 * Hint:
 * - Create a Bogie class with type and capacity.
 * - Store bogie objects in a List.
 * - Convert the list into a stream.
 * - Use Collectors.groupingBy() to group bogies by type.
 * - Display grouped results.
 *
 * @author Developer
 * @version 9.0
 */

// Class representing a bogie with type and capacity
class Bogie {
    String name;      // Bogie type (Passenger / Goods)
    int capacity;     // Seating or load capacity

    // Constructor to initialize bogie details
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class TrainApp {
    public static void main(String[] args) {

        // Create a list of bogie objects
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Passenger", 72),
                new Bogie("Passenger", 56),
                new Bogie("Goods", 100)
        );

        // Convert list into stream and group bogies by type using groupingBy()
        Map<String, List<Bogie>> grouped =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        // Iterate through the grouped map and display results
        grouped.forEach((type, list) -> {
            System.out.println(type + ":");
            list.forEach(b -> System.out.println("  Capacity: " + b.capacity));
        });
    }
}

