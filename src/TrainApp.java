import java.util.HashMap;
import java.util.Map;

/**
 * UC6 – Map Bogie to Capacity using HashMap
 *
 * Hint:
 * - Create a HashMap to store bogie names and capacities.
 * - Add key–value pairs using put().
 * - Iterate through the map using entrySet().
 * - Display each bogie and its capacity.
 *
 * @author Developer
 * @version 6.0
 */
public class TrainApp {

    public static void main(String[] args) {

        // Create a HashMap to map bogie names to their capacities
        Map<String, Integer> capacityMap = new HashMap<>();

        // Add bogie capacity details using put() method
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 56);

        // Iterate through the map entries and display key–value pairs
        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}


