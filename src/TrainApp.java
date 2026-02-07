/**
 * UC14 – Handle Invalid Bogie Capacity using Custom Exception
 *
 * Hint:
 * - Create a custom exception class.
 * - Validate bogie capacity in constructor.
 * - Throw exception if capacity is zero or negative.
 * - Handle the exception using try–catch in main().
 *
 * @author Developer
 * @version 14.0
 */

// Custom exception class to handle invalid capacity
class InvalidCapacityException extends Exception {

    // Constructor to pass custom error message
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Passenger bogie class with capacity validation
class PassengerBogie {
    String type;
    int capacity;

    // Constructor that validates capacity
    PassengerBogie(String type, int capacity) throws InvalidCapacityException {

        // Check if capacity is invalid
        if (capacity <= 0) {
            // Throw custom exception if capacity is invalid
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }

        // Assign values if capacity is valid
        this.type = type;
        this.capacity = capacity;
    }
}

public class TrainApp {

    public static void main(String[] args) {

        try {
            // Attempt to create bogie with invalid capacity
            PassengerBogie bogie = new PassengerBogie("Sleeper", -5);

            // If capacity is valid, display bogie details
            System.out.println("Bogie Created: " + bogie.type +
                    " Capacity: " + bogie.capacity);

        } catch (InvalidCapacityException e) {
            // Handle exception and display error message
            System.out.println("Error: " + e.getMessage());
        }
    }
}
