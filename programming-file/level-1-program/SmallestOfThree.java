import java.util.*;
class SmallestOfThree {
    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Get three numbers
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        // Check if first number is the smallest
        boolean isSmallest = number1 < number2 && number1 < number3;

        // Output
        System.out.println("Is the first number the smallest? " + isSmallest);
    }
}