import java.util.*; // Import Scanner for user input

// Class to calculate triangle area in cm² and convert to in²
class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner object

        // Taking base and height input in centimeters
        System.out.print("Enter base in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();

        // Area formula: (1/2) * base * height
        double areaCm = 0.5 * base * height;

        // Conversion from cm² to in² (1 in² = 6.4516 cm²)
        double areaInches = areaCm / 6.4516;

        // Display results
        System.out.println("The Area of the triangle in sq cm is " + areaCm + " and in sq inches is " + areaInches);
    }
}
