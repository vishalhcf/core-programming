import java.util.Scanner;

// Program to convert feet to yards and miles
class FeetToMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare variable
        double feet;

        // Take input
        System.out.print("Enter distance in feet: ");
        feet = input.nextDouble();

        // Convert
        double yards = feet / 3;
        double miles = yards / 1760;

        // Display result
        System.out.println("The distance is " + feet + " feet, which is " + yards + " yards and " + miles + " miles");
    }
}
