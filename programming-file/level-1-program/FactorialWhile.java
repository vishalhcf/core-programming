import java.util.*;
class FactorialWhile {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number input
        int number = input.nextInt();

        // Validate positive integer
        if (number >= 0) {
            int factorial = 1;
            int i = 1;

            // Compute factorial
            while (i <= number) {
                factorial *= i;
                i++;
            }

            // Display result
            System.out.println("Factorial: " + factorial);
        } else {
            System.out.println("Enter a non-negative integer");
        }
    }
}