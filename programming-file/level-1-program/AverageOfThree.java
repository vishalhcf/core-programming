// Program: Calculate Average of Three Numbers
// Level: 1 - Java Input, Arithmetic, and Variables
// Author: Vishal Kumar

import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Variable declarations
        double firstNumber;
        double secondNumber;
        double thirdNumber;
        double average;

        // Taking three numbers as input
        System.out.print("Enter first number: ");
        firstNumber = input.nextDouble();

        System.out.print("Enter second number: ");
        secondNumber = input.nextDouble();

        System.out.print("Enter third number: ");
        thirdNumber = input.nextDouble();

        // Calculating the average
        average = (firstNumber + secondNumber + thirdNumber) / 3;

        // Displaying the result
        System.out.println("Average: " + average);
    }
}
