import java.util.*;
// Program to calculate discount and final fee
class DiscountCalculator {
    public static void main(String[] args) {

        // Declare original fee and discount percentage
        double fee = 125000;
        double discountPercent = 10;

        // Calculate discount and final fee
        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;

        // Display result
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
