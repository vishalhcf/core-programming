import java.util.Scanner;

public class NumberChecker5 {

    // Method to get all factors of a number
    public static int[] getFactors(int number) {
        int count = 0;

        // First loop: count number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }

        // Second loop: store them in array
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                factors[index++] = i;
        }

        return factors;
    }

    // Greatest factor (excluding the number itself)
    public static int getGreatestFactor(int[] factors, int number) {
        int max = 1;
        for (int i : factors) {
            if (i != number && i > max)
                max = i;
        }
        return max;
    }

    // Sum of factors
    public static int getSumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    // Product of factors
    public static int getProductOfFactors(int[] factors) {
        int prod = 1;
        for (int f : factors) {
            prod *= f;
        }
        return prod;
    }

    // Product of cubes of the factors
    public static double getProductOfCubes(int[] factors) {
        double prod = 1;
        for (int f : factors) {
            prod *= Math.pow(f, 3);
        }
        return prod;
    }

    // Check perfect number (sum of proper divisors == number)
    public static boolean isPerfect(int number, int[] factors) {
        int sum = 0;
        for (int f : factors) {
            if (f != number)
                sum += f;
        }
        return sum == number;
    }

    // Check abundant number (sum of proper divisors > number)
    public static boolean isAbundant(int number, int[] factors) {
        int sum = 0;
        for (int f : factors) {
            if (f != number)
                sum += f;
        }
        return sum > number;
    }

    // Check deficient number (sum of proper divisors < number)
    public static boolean isDeficient(int number, int[] factors) {
        int sum = 0;
        for (int f : factors) {
            if (f != number)
                sum += f;
        }
        return sum < number;
    }

    // Check strong number
    public static boolean isStrong(int number) {
        int original = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }
        return sum == original;
    }

    // Helper method to calculate factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++)
            fact *= i;
        return fact;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        int[] factors = getFactors(num);

        System.out.println("\nFactors:");
        for (int f : factors) System.out.print(f + " ");
        System.out.println();

        System.out.println("Greatest factor (excluding number): " + getGreatestFactor(factors, num));
        System.out.println("Sum of factors: " + getSumOfFactors(factors));
        System.out.println("Product of factors: " + getProductOfFactors(factors));
        System.out.printf("Product of cube of factors: %.2f\n", getProductOfCubes(factors));

        System.out.println("Is Perfect Number? " + isPerfect(num, factors));
        System.out.println("Is Abundant Number? " + isAbundant(num, factors));
        System.out.println("Is Deficient Number? " + isDeficient(num, factors));
        System.out.println("Is Strong Number? " + isStrong(num));

        sc.close();
    }
}