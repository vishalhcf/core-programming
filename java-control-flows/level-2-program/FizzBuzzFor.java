import java.util.Scanner;

// Class to implement FizzBuzz using for loop
class FizzBuzzFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare variable
        int number = 0;

        // Input value
        System.out.print("Enter a positive integer: ");
        number = input.nextInt();

        // Check if valid
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Please enter a valid positive integer.");
        }

        input.close();
    }
}
