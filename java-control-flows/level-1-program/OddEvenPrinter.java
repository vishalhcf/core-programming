import java.util.Scanner;

class OddEvenPrinter {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int number = 10;

      if (number >= 1) {
         for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
               System.out.println(i + " is Even");
            } else {
               System.out.println(i + " is Odd");
            }
         }
      } else {
         System.out.println("Not a valid natural number.");
      }

      input.close();
   }
}
