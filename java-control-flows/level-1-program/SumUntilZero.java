import java.util.Scanner;

class SumUntilZero {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // Declare input and result variables
      double number = 0.0;
      double totalSum = 0.0;

      // Get first input value
      System.out.print("Enter a number (0 to stop): ");
      number = input.nextDouble();

      // While loop runs until user enters 0
      while (number != 0.0) {
         totalSum += number;

         System.out.print("Enter a number (0 to stop): ");
         number = input.nextDouble();
      }

      // Print final sum
      System.out.println("The total sum is: " + totalSum);
      input.close();
   }
}
