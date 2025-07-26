import java.util.*; // Import Scanner

// Class to calculate total purchase price
class PurchaseCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner object

        // Taking unit price and quantity from user
        System.out.print("Enter unit price in INR: ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        // Calculating total cost
        double totalPrice = unitPrice * quantity;

        // Output
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " 
            + quantity + " and unit price is INR " + unitPrice);
    }
}
