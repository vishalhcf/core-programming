import java.util.*;
class OddEvenNumbers {
    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Get input
        int number = input.nextInt();

        // Check for natural number
        if (number >= 1) {
            // Loop and check each number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even");
                } else {
                    System.out.println(i + " is odd");
                }
            }
        } else {
            System.out.println("Enter a natural number");
        }
    }
}