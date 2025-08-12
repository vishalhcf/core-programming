import java.util.Scanner;

public class CollinearityCheck {

    // Method to check collinearity using slope
    public static boolean isCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Method to check collinearity using area of triangle formula
    public static boolean isCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3)
                           + x2 * (y3 - y1)
                           + x3 * (y1 - y2));
        return area == 0.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Three points
        System.out.print("Enter x1 and y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.print("Enter x3 and y3: ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        // Check collinearity using slope
        boolean slopeCollinear = isCollinearBySlope(x1, y1, x2, y2, x3, y3);
        System.out.println("\nUsing Slope Formula: " + (slopeCollinear ? "Collinear" : "Not Collinear"));

        // Check collinearity using area
        boolean areaCollinear = isCollinearByArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Using Area Formula: " + (areaCollinear ? "Collinear" : "Not Collinear"));
    }
}