import java.util.Scanner;

class NaturalNumberSum {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // Get input from user
      int number = input.nextInt();

      // Check if number is natural (>=1)
      if (number >= 1) {
         int sum = number * (number + 1) / 2;
         System.out.println("The sum of " + number + " natural numbers is " + sum);
      } else {
         System.out.println("The number " + number + " is not a natural number");
      }

      input.close();
   }
}
