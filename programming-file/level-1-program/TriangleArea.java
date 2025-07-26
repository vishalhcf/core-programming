import java.util.Scanner;

// Program to find area of triangle
class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare variables
        double base, height;

        // Take inputs
        System.out.print("Enter base in inches: ");
        base = input.nextDouble();

        System.out.print("Enter height in inches: ");
        height = input.nextDouble();

        // Calculate area
        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 6.4516;

        // Display result
        System.out.println("Area in square inches is " + areaInInches + " and in square centimeters is " + areaInCm);
    }
}
