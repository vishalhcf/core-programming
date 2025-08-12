import java.util.Scanner;

public class PositiveNegativeEvenOddCompare {

    // Method to check if a number is positive
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    // Method to check if a number is even
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Method to compare two numbers
    // Returns: 1 if a > b, 0 if a == b, -1 if a < b
    public static int compare(int a, int b) {
        if (a > b) return 1;
        else if (a == b) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Check each number
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];

            if (isPositive(num)) {
                System.out.print("Number " + num + " is Positive and ");
                if (isEven(num)) {
                    System.out.println("Even.");
                } else {
                    System.out.println("Odd.");
                }
            } else {
                System.out.println("Number " + num + " is Negative.");
            }
        }

        // Compare first and last number
        int result = compare(numbers[0], numbers[4]);

        System.out.print("\nComparison between first and last number: ");
        if (result == 1) {
            System.out.println("First number is greater.");
        } else if (result == 0) {
            System.out.println("First and last numbers are equal.");
        } else {
            System.out.println("First number is smaller.");
        }

        sc.close();
    }
}