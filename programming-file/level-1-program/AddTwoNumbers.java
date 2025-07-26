// Program: Add Two Numbers
// Level: 1 - Java Input and Arithmetic
// Author: Vishal Kumar

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Variable declarations
        int firstNumber;
        int secondNumber;
        int sum;

        // Taking two numbers as input
        System.out.print("Enter first number: ");
        firstNumber = input.nextInt();

        System.out.print("Enter second number: ");
        secondNumber = input.nextInt();

        // Calculating the sum
        sum = firstNumber + secondNumber;

        // Displaying the result
        System.out.println("Sum: " + sum);
    }
}
