import java.util.*; // Import Scanner

// Class to calculate side of a square from perimeter
class SquareSide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner object

        // Input perimeter value from user
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Side = Perimeter / 4
        double side = perimeter / 4;

        // Display output
        System.out.println("The length of the side is " + side + " when the perimeter is " + perimeter);
    }
}
