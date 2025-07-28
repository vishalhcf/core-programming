import java.util.Scanner;

class SpringSeason {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int month = input.nextInt();
      int day = input.nextInt();

      boolean isSpring = (month == 3 && day >= 20) || 
                         (month == 4) || 
                         (month == 5) || 
                         (month == 6 && day <= 20);

      if (isSpring) {
         System.out.println("It's a Spring Season");
      } else {
         System.out.println("Not a Spring Season");
      }

      input.close();
   }
}
