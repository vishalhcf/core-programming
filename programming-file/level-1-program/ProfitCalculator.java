import java.util.*;
// Program to calculate profit and profit percentage
class ProfitCalculator {
    public static void main(String[] args) {

        // Declare cost and selling price
        double costPrice = 129;
        double sellingPrice = 191;

        // Calculate profit and profit percentage
        double profit = sellingPrice - costPrice;
        double profitPercent = (profit / costPrice) * 100;

        // Display all results
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice);
        System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);
    }
}
