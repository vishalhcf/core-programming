import java.util.Scanner;

class LargestChecker {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // Input values
      int number1 = input.nextInt();
      int number2 = input.nextInt();
      int number3 = input.nextInt();

      // Check each one
      boolean firstLargest = number1 > number2 && number1 > number3;
      boolean secondLargest = number2 > number1 && number2 > number3;
      boolean thirdLargest = number3 > number1 && number3 > number2;

      System.out.println("Is the first number the largest? " + firstLargest);
      System.out.println("Is the second number the largest? " + secondLargest);
      System.out.println("Is the third number the largest? " + thirdLargest);

      input.close();
   }
}
