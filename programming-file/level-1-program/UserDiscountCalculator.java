import java.util.Scanner;

// Program to compute discount from user input
class UserDiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare variables
        double fee, discountPercent;

        // Take inputs
        System.out.print("Enter the Student Fee: ");
        fee = input.nextDouble();

        System.out.print("Enter Discount Percentage: ");
        discountPercent = input.nextDouble();

        // Calculate discount and final fee
        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;

        // Display result
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
