import java.util.Scanner;

public class QuadraticEquationSolver {

    // Method to find the roots of a quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            // Two real and distinct roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            // One real root
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            // No real roots
            return new double[0];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a, b, c
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("Not a quadratic equation. 'a' cannot be 0.");
            return;
        }

        // Call method to get roots
        double[] roots = findRoots(a, b, c);

        // Output roots
        if (roots.length == 2) {
            System.out.println("The roots are real and distinct:");
            System.out.println("Root 1: " + roots[0]);
            System.out.println("Root 2: " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("The root is real and equal:");
            System.out.println("Root: " + roots[0]);
        } else {
            System.out.println("No real roots. Discriminant is negative.");
        }

        sc.close();
    }
}