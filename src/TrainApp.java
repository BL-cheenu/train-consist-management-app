import java.util.LinkedHashSet;
import java.util.Set;

/**
 * UC5 – Preserve Train Formation Order using LinkedHashSet
 *
 * Hint:
 * - Create a LinkedHashSet to store bogies.
 * - Add bogies in formation order.
 * - Display the formation and observe that insertion order is preserved.
 *
 * @author Developer
 * @version 5.0
 */
public class TrainApp {

    public static void main(String[] args) {

        // Create a LinkedHashSet to maintain insertion order
        Set<String> formation = new LinkedHashSet<>();

        // Add bogies in formation order
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Goods");

        // Display the formation
        System.out.println("Train Formation: " + formation);
    }
}

