import java.util.*;
class AllEqualCheck {
    public static void main(String[] args) {
        // Scanner object
        Scanner input = new Scanner(System.in);

        // Get three inputs
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        // Check equality
        boolean allEqual = num1 == num2 && num2 == num3;

        // Print result
        System.out.println("Are all numbers equal? " + allEqual);
    }
}