// Program: Calculate Volume of a Cylinder
// Level: 1 - Java Input, Arithmetic, and Math Library
// Author: Vishal Kumar

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Variable declarations
        double radius;
        double height;
        double volume;

        // Taking radius and height as input
        System.out.print("Enter radius: ");
        radius = input.nextDouble();

        System.out.print("Enter height: ");
        height = input.nextDouble();

        // Calculating volume using formula: π * r^2 * h
        volume = Math.PI * radius * radius * height;

        // Displaying the result
        System.out.println("Volume of Cylinder: " + volume);
    }
}
