import java.util.Scanner;
class DivisibleBy5 {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number input
        int number = input.nextInt();

        // Check divisibility
        boolean isDivisible = number % 5 == 0;

        // Output result
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);
    }
}