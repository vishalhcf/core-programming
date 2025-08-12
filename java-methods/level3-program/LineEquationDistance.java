import java.util.Scanner;

public class LineEquationDistance {

    // Method to calculate Euclidean distance
    public static double getDistance(double x1, double y1, double x2, double y2) {
        double dist = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return dist;
    }

    // Method to calculate slope and y-intercept
    public static double[] getLineEquation(double x1, double y1, double x2, double y2) {
        double[] equation = new double[2]; // [0] => slope (m), [1] => y-intercept (b)

        if (x1 == x2) {
            // Slope is undefined (vertical line)
            throw new IllegalArgumentException("Slope is undefined for vertical line (x1 == x2)");
        }

        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;

        equation[0] = m;
        equation[1] = b;
        return equation;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Calculate and display distance
        double distance = getDistance(x1, y1, x2, y2);
        System.out.printf("\nEuclidean Distance = %.2f\n", distance);

        // Calculate and display line equation
        try {
            double[] equation = getLineEquation(x1, y1, x2, y2);
            System.out.printf("Equation of the Line: y = %.2fx + %.2f\n", equation[0], equation[1]);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}