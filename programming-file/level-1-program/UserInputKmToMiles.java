import java.util.*;
import java.util.Scanner;

// Program to convert kilometers to miles using user input
class UserInputKmToMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare distance variable
        double km;

        // Take input
        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble();

        // Convert to miles
        double miles = km / 1.6;

        // Display result
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }
}
