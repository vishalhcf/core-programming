import java.util.Scanner;

class SumNaturalWhile {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // Input variable
      int number = 5;

      // Check if number is natural
      if (number >= 1) {
         // Using formula
         int formulaSum = number * (number + 1) / 2;

         // Using while loop
         int sum = 0;
         int i = 1;
         while (i <= number) {
            sum += i;
            i++;
         }

         // Display both
         System.out.println("Sum using formula: " + formulaSum);
         System.out.println("Sum using while loop: " + sum);
      } else {
         System.out.println("Not a natural number.");
      }

      input.close();
   }
}
