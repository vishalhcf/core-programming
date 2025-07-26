import java.util.Scanner;

// Program to calculate total purchase price
class TotalPurchase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare variables
        double unitPrice;
        int quantity;

        // Take input
        System.out.print("Enter unit price: ");
        unitPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        quantity = input.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // Display result
        System.out.println("The total purchase price is INR " + totalPrice + 
                           " if the quantity " + quantity + " and unit price is INR " + unitPrice);
    }
}
