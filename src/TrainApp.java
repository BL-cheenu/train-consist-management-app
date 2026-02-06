import java.util.ArrayList;
import java.util.List;

/**
 * TrainApp UC2 – Add Passenger Bogies to Train (ArrayList Operations)
 *
 * This program demonstrates how to store passenger bogies using ArrayList
 * and perform basic collection operations such as add, remove, and contains.
 *
 * @author User
 * @version 2.0
 */


/**
 * Hint:
 * - Create an ArrayList to store passenger bogies.
 * - Add bogies such as Sleeper, AC Chair, and First Class.
 * - Display the list of bogies.
 * - Remove one bogie from the list.
 * - Check whether a specific bogie exists using contains()
 */
public class TrainApp {

    public static void main(String[] args) {

        // Create a List using ArrayList to store passenger bogies dynamically
        List<String> passengerBogies = new ArrayList<>();

        // Add passenger bogies of different travel classes
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display the current list of passenger bogies
        System.out.println("Passenger Bogies: " + passengerBogies);

        // Remove a specific bogie from the list
        passengerBogies.remove("AC Chair");

        // Check whether "Sleeper" bogie exists in the list
        System.out.println("Contains Sleeper? " +passengerBogies.contains("Sleeper"));
    }
}


