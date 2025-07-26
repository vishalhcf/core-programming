// Program: Calculate Area of a Circle
// Level: 1 - Java Input, Variables, and Math
// Author: Vishal Kumar

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Variable declarations
        double radius;
        double area;

        // Taking radius as input
        System.out.print("Enter radius: ");
        radius = input.nextDouble();

        // Calculating area using formula: π * r^2
        area = Math.PI * radius * radius;

        // Displaying the result
        System.out.println("Area of Circle: " + area);
    }
}
