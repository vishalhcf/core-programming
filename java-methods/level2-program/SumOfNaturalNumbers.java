import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Recursive method to find sum of n natural numbers
    public static int recursiveSum(int n) {
        if (n == 1) return 1;  // base case
        return n + recursiveSum(n - 1);  // recursion
    }

    // Formula method to find sum of n natural numbers
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input
        System.out.print("Enter a natural number (n ≥ 1): ");
        int n = sc.nextInt();

        // Check if valid natural number
        if (n < 1) {
            System.out.println("Invalid input. Please enter a natural number (n ≥ 1).");
            return;
        }

        // Calculate both sums
        int sumRecursion = recursiveSum(n);
        int sumFormula = formulaSum(n);

        // Output
        System.out.println("Sum using recursion: " + sumRecursion);
        System.out.println("Sum using formula: " + sumFormula);

        // Compare
        if (sumRecursion == sumFormula) {
            System.out.println("✅ Both methods give the same result. Computation is correct.");
        } else {
            System.out.println("❌ Mismatch in results. Please check the logic.");
        }
    }
}