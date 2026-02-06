import java.util.*;

/**
 * UC10 – Count Total Seats in Train using reduce()
 *
 * Hint:
 * - Create a Bogie class with name and capacity.
 * - Store bogie objects in a List.
 * - Convert the list into a stream.
 * - Use map() to extract capacity values.
 * - Use reduce() to calculate the total capacity.
 *
 * @author Developer
 * @version 10.0
 */

// Class representing a bogie with name and seating capacity
class Bogie {
    String name;      // Bogie type
    int capacity;     // Seating capacity

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
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 64)
        );

        // Convert the list into a stream, extract capacity values using map(),
        // and aggregate them using reduce() to calculate total seating capacity
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)        // Extract capacity values
                .reduce(0, Integer::sum);    // Sum all capacities

        // Display the total seating capacity
        System.out.println("Total Seating Capacity: " + totalSeats);
    }
}

