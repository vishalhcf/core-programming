import java.util.*; // Import Scanner

// Class to convert distance from feet to yards and miles
class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner object

        // Input distance in feet
        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();

        // Conversion formulas
        double yards = feet / 3.0;         // 1 yard = 3 feet
        double miles = yards / 1760.0;     // 1 mile = 1760 yards

        // Output result
        System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles);
    }
}
