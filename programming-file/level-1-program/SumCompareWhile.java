import java.util.*;
class SumCompareWhile {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get input number
        int number = input.nextInt();

        // Check for natural number
        if (number >= 1) {
            int sum = 0, i = 1;

            // Calculate sum using while loop
            while (i <= number) {
                sum += i;
                i++;
            }

            // Formula result
            int formulaSum = number * (number + 1) / 2;

            // Display both
            System.out.println("Sum using while loop: " + sum);
            System.out.println("Sum using formula: " + formulaSum);
        } else {
            System.out.println("Not a natural number");
        }
    }
}