import java.util.Scanner;

public class FactorDetails {

    // Method to get array of factors of the given number
    public static int[] getFactors(int number) {
        int count = 0;

        // First loop to count number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                count++;
        }

        // Declare array with exact size
        int[] factors = new int[count];
        int index = 0;

        // Second loop to store actual factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    // Method to calculate sum of elements in the array
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    // Method to calculate product of elements in the array
    public static int calculateProduct(int[] array) {
        int product = 1;
        for (int value : array) {
            product *= value;
        }
        return product;
    }

    // Method to calculate sum of squares of elements in the array
    public static int calculateSumOfSquares(int[] array) {
        int sumOfSquares = 0;
        for (int value : array) {
            sumOfSquares += Math.pow(value, 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take input from user
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();

        // Step 2: Get factors in an array
        int[] factors = getFactors(number);

        // Step 3: Display all factors
        System.out.print("Factors of " + number + " are: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        // Step 4: Calculate sum, product, and sum of squares
        int sum = calculateSum(factors);
        int product = calculateProduct(factors);
        int sumSquares = calculateSumOfSquares(factors);

        // Step 5: Display the results
        System.out.println("\nSum of Factors: " + sum);
        System.out.println("Product of Factors: " + product);
        System.out.println("Sum of Squares of Factors: " + sumSquares);
    }
}
