import java.util.*;
class SumUntilNegative {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Initialize total
        double total = 0.0;

        // Infinite loop
        while (true) {
            // Get input
            double value = input.nextDouble();

            // Break if zero or negative
            if (value <= 0) {
                break;
            }

            // Add to total
            total += value;
        }

        // Display result
        System.out.println("Total: " + total);
    }
}