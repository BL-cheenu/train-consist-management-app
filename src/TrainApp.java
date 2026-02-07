import java.util.regex.*;

/**
 * UC11 – Validate Train ID & Cargo Codes using Regular Expressions
 *
 * Hint:
 * - Define regex patterns for Train ID and Cargo Code.
 * - Compile patterns using Pattern class.
 * - Use Matcher to validate input strings.
 * - Display validation results.
 *
 * @author Developer
 * @version 11.0
 */
public class TrainApp {

    public static void main(String[] args) {

        // Example Train ID and Cargo Code inputs
        String trainId = "TRN-1234";
        String cargoCode = "PET-XX";

        // Define regex pattern for Train ID (TRN- followed by 4 digits)
        Pattern trainPattern = Pattern.compile("TRN-\\d{4}");

        // Define regex pattern for Cargo Code (PET- followed by 2 uppercase letters)
        Pattern cargoPattern = Pattern.compile("PET-[A-Z]{2}");

        // Create matcher objects to compare input with patterns
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // Validate Train ID and display result
        System.out.println("Valid Train ID: " + trainMatcher.matches());

        // Validate Cargo Code and display result
        System.out.println("Valid Cargo Code: " + cargoMatcher.matches());
    }
}
