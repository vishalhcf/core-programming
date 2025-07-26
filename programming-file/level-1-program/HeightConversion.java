import java.util.Scanner;

// Program to convert cm to feet and inches
class HeightConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare height in cm
        double heightCm;

        // Take input
        System.out.print("Enter your height in centimeters: ");
        heightCm = input.nextDouble();

        // Convert to inches and feet
        double totalInches = heightCm / 2.54;
        int feet = (int)(totalInches / 12);
        double inches = totalInches % 12;

        // Display result
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);
    }
}
