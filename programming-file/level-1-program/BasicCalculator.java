import java.util.Scanner;

// Program to perform basic arithmetic operations
class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare and take input
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        // Perform operations
        double sum = number1 + number2;
        double difference = number1 - number2;
        double product = number1 * number2;
        double quotient = number1 / number2;

        // Display result
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 +
                           " is " + sum + ", " + difference + ", " + product + ", and " + quotient);
    }
}
