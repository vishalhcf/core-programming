import java.util.*;
class FactorialFor {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number input
        int number = input.nextInt();

        // Validate non-negative
        if (number >= 0) {
            int factorial = 1;

            // Loop to compute factorial
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Display factorial
            System.out.println("Factorial: " + factorial);
        } else {
            System.out.println("Enter a non-negative integer");
        }
    }
}