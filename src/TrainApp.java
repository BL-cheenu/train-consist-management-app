import java.util.*;

/**
 * UC12 – Safety Compliance Check for Goods Bogies
 *
 * Hint:
 * - Create a GoodsBogie class with type and cargo.
 * - Store goods bogie objects in a List.
 * - Convert the list into a stream.
 * - Use allMatch() to check the safety rule:
 *   Cylindrical bogies must carry only Petroleum.
 *
 * @author Developer
 * @version 12.0
 */

// Class representing a goods bogie
class GoodsBogie {
    String type;   // Bogie type (Cylindrical / Rectangular)
    String cargo;  // Cargo carried by the bogie

    // Constructor to initialize bogie details
    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

public class TrainApp {
    public static void main(String[] args) {

        // Create list of goods bogies
        List<GoodsBogie> goodsBogies = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Rectangular", "Coal")
        );

        // Check safety compliance:
        // If bogie type is Cylindrical, cargo must be Petroleum
        boolean safe = goodsBogies.stream()
                .allMatch(b -> !b.type.equals("Cylindrical")
                        || b.cargo.equals("Petroleum"));

        // Display safety compliance result
        System.out.println("Safety Compliance: " + safe);
    }
}

