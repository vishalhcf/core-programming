import java.util.*; // Import Scanner

// Class to demonstrate operator precedence using integers
class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner object

        // Input three integers
        System.out.print("Enter value for a: ");
        int a = input.nextInt();

        System.out.print("Enter value for b: ");
        int b = input.nextInt();

        System.out.print("Enter value for c: ");
        int c = input.nextInt();

        // Different expressions to show precedence
        int result1 = a + b * c;      // Multiplication before addition
        int result2 = a * b + c;      // Multiplication first
        int result3 = c + a / b;      // Division before addition
        int result4 = a % b + c;      // Modulus before addition

        // Output results
        System.out.println("Results of Int Operations: " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}
