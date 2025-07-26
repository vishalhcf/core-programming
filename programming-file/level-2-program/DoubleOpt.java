import java.util.*; // Import Scanner

// Class to demonstrate operator precedence using doubles
class DoubleOpt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner object

        // Input three double values
        System.out.print("Enter value for a: ");
        double a = input.nextDouble();

        System.out.print("Enter value for b: ");
        double b = input.nextDouble();

        System.out.print("Enter value for c: ");
        double c = input.nextDouble();

        // Expression evaluations
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        // Display all results
        System.out.println("Results of Double Operations: " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}
