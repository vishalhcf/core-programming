import java.util.*;
class SumUntilZero {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Initialize total to 0.0
        double total = 0.0;

        // Repeat until user enters 0
        while (true) {
            // Get input value
            double value = input.nextDouble();

            // Check if value is 0
            if (value == 0.0) {
                break;
            }

            // Add to total
            total += value;
        }

        // Display total
        System.out.println("Total: " + total);
    }
}