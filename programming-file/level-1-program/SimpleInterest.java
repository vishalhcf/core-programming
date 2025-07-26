// Program: Calculate Simple Interest
// Level: 1 - Java Input, Arithmetic Operations
// Author: Vishal Kumar

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Variable declarations
        double principal;
        double rate;
        double time;
        double interest;

        // Taking input values from user
        System.out.print("Enter Principal: ");
        principal = input.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        rate = input.nextDouble();

        System.out.print("Enter Time (in years): ");
        time = input.nextDouble();

        // Calculating simple interest using the formula
        interest = (principal * rate * time) / 100;

        // Displaying the result
        System.out.println("Simple Interest: " + interest);
    }
}
