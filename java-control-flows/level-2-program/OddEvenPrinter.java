import java.util.Scanner;

// Class to print odd and even numbers from 1 to given number
class OddEvenPrinter {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Declare input variable
        int number = 0;

        // Ask user to input number
        System.out.print("Enter a natural number: ");
        number = input.nextInt();

        // Check if valid natural number
        if (number >= 1) {
            // Loop from 1 to number
            for (int i = 1; i <= number; i++) {
                // Check if even or odd
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }
        } else {
            System.out.println("Please enter a valid natural number (>=1)");
        }

        input.close();
    }
}
