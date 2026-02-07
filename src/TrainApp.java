/**
 * UC15 – Safe Cargo Assignment Using try-catch-finally
 *
 * Hint:
 * - Create a custom runtime exception.
 * - Validate cargo assignment inside try block.
 * - Throw exception for unsafe cargo.
 * - Handle exception using catch block.
 * - Use finally block for completion message.
 *
 * @author Developer
 * @version 15.0
 */

// Custom runtime exception to represent unsafe cargo assignment
class CargoSafetyException extends RuntimeException {

    // Constructor to pass error message
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Class representing a goods bogie
class GoodsBogie {
    String shape;   // Shape of bogie (Rectangular / Cylindrical)
    String cargo;   // Cargo carried by bogie

    // Method to assign cargo with safety validation
    void assignCargo(String shape, String cargo) {

        try {
            // Check unsafe condition: Rectangular bogie carrying Petroleum
            if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {

                // Throw custom runtime exception if unsafe
                throw new CargoSafetyException("Unsafe cargo assignment!");
            }

            // Assign cargo if safe
            this.cargo = cargo;
            System.out.println("Cargo assigned successfully");

        } catch (CargoSafetyException e) {
            // Handle exception and display error message
            System.out.println("Error: " + e.getMessage());

        } finally {
            // Finally block executes always (for logging / confirmation)
            System.out.println("Cargo validation completed");
        }
    }
}

// Main class to test cargo assignment
public class TrainApp {

    public static void main(String[] args) {

        // Create goods bogie object
        GoodsBogie bogie = new GoodsBogie();

        // Attempt to assign cargo
        bogie.assignCargo("Rectangular", "Petroleum");
    }
}
