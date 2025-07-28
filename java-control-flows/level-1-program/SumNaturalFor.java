import java.util.Scanner;

class SumNaturalFor {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int number = 5;

      if (number >= 1) {
         int formulaSum = number * (number + 1) / 2;

         int sum = 0;
         for (int i = 1; i <= number; i++) {
            sum += i;
         }

         System.out.println("Sum using formula: " + formulaSum);
         System.out.println("Sum using for loop: " + sum);
      } else {
         System.out.println("Not a natural number.");
      }

      input.close();
   }
}
