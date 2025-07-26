// Program: Convert Kilometers to Miles
// Level: 1 - Java Input, Variables, and Arithmetic
// Author: Vishal Kumar

import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        // Create Scanner object to read input from user
        Scanner input = new Scanner(System.in);

        // Variable declarations
        double kilometers;
        double miles;

        // Taking distance in kilometers as input
        System.out.print("Enter distance in kilometers: ");
        kilometers = input.nextDouble();

        // Converting kilometers to miles
        miles = kilometers * 0.621371;

        // Displaying the result
        System.out.println("Distance in miles: " + miles);
    }
}
