import java.util.Scanner;

class DivisibilityChecker {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // Take input number from user
      int number = input.nextInt();

      // Check divisibility
      boolean isDivisible = number % 5 == 0;

      // Display result
      System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);

      input.close();
   }
}
