import java.util.*; // Importing Scanner class for taking user input

// Class to perform basic calculator operations
class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creating Scanner object

        // Taking two input numbers from user
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble(); // Read first number

        System.out.print("Enter second number: ");
        double number2 = input.nextDouble(); // Read second number

        // Performing arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Displaying results
        System.out.println("The addition, subtraction, multiplication, and division value of " 
            + number1 + " and " + number2 + " is " + addition + ", " 
            + subtraction + ", " + multiplication + ", and " + division);
    }
}
