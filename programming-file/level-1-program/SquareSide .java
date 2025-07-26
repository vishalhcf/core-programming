import java.util.Scanner;

// Program to find side from perimeter
class SquareSide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare variable
        double perimeter;

        // Take input
        System.out.print("Enter perimeter of the square: ");
        perimeter = input.nextDouble();

        // Calculate side
        double side = perimeter / 4;

        // Display result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}
