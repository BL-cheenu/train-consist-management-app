/**
 * UC20 – Exception Handling During Search Operations
 *
 * Hint:
 * - Check whether the bogie list is empty before searching.
 * - Throw IllegalStateException if no bogies are available.
 * - Continue search only when data exists.
 *
 * @author Developer
 * @version 20.0
 */
public class TrainApp {

    public static void main(String[] args) {

        // Array representing train bogie IDs (empty train)
        String[] bogieIds = {};

        // Defensive programming: check if train has bogies
        if (bogieIds.length == 0) {

            // Throw exception if search is attempted on empty train
            throw new IllegalStateException("No bogies available in train");
        }

        // Search logic would execute only if bogies are present
        System.out.println("Search can proceed...");
    }
}
