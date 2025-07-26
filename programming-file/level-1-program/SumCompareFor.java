import java.util.*;
class SumCompareFor {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number
        int number = input.nextInt();

        // Check for natural number
        if (number >= 1) {
            int sum = 0;

            // Sum using for loop
            for (int i = 1; i <= number; i++) {
                sum += i;
            }

            // Sum using formula
            int formulaSum = number * (number + 1) / 2;

            // Print both
            System.out.println("Sum using for loop: " + sum);
            System.out.println("Sum using formula: " + formulaSum);
        } else {
            System.out.println("Not a natural number");
        }
    }
}