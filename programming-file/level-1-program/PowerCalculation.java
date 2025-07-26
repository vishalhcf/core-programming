// Program: Power Calculation (Base^Exponent)
// Level: 1 - Java Math Functions and Input
// Author: Vishal Kumar

import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        // Create Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Variable declarations
        double base;
        double exponent;
        double result;

        // Taking base and exponent as input
        System.out.print("Enter base: ");
        base = input.nextDouble();

        System.out.print("Enter exponent: ");
        exponent = input.nextDouble();

        // Calculating power using Math.pow() method
        result = Math.pow(base, exponent);

        // Displaying the result
        System.out.println("Result: " + result);
    }
}
