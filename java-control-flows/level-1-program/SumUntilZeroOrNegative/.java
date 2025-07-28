import java.util.Scanner;

class SumUntilZeroOrNegative {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      double number = 0.0;
      double totalSum = 0.0;

      while (true) {
         System.out.print("Enter a number (0 or negative to stop): ");
         number = input.nextDouble();

         if (number <= 0.0) {
            break;
         }

         totalSum += number;
      }

      System.out.println("The total sum is: " + totalSum);
      input.close();
   }
}
