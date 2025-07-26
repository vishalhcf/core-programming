// Program: Celsius to Fahrenheit Conversion
// Level: 1 - Java Input, Variables, and Arithmetic
// Author: Vishal Kumar

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        // Create Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Variable declarations
        double celsius;
        double fahrenheit;

        // Taking temperature in Celsius as input
        System.out.print("Enter temperature in Celsius: ");
        celsius = input.nextDouble();

        // Converting Celsius to Fahrenheit using formula
        fahrenheit = (celsius * 9 / 5) + 32;

        // Displaying the converted temperature
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}
