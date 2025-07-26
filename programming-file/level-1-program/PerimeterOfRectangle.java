// Program: Perimeter of a Rectangle
// Level: 1 - Java Basics and Control Flow
// Author: Vishal Kumar

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Variable declarations
        double length;
        double width;
        double perimeter;

        // Taking length and width as input
        System.out.print("Enter length: ");
        length = input.nextDouble();

        System.out.print("Enter width: ");
        width = input.nextDouble();

        // Calculating perimeter of rectangle
        perimeter = 2 * (length + width);

        // Printing the result
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}
