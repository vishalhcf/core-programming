import java.util.Scanner;

class MultiplicationTable {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int number = 3;

      for (int i = 6; i <= 9; i++) {
         System.out.println(number + " * " + i + " = " + (number * i));
      }

      input.close();
   }
}
