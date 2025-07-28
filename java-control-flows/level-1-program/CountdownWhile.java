import java.util.Scanner;

class CountdownWhile {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int counter = input.nextInt();

      while (counter >= 1) {
         System.out.println("Countdown: " + counter);
         counter--;
      }

      input.close();
   }
}
