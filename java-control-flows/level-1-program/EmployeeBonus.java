import java.util.Scanner;

class EmployeeBonus {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      double salary = 50000.0;
      int yearsOfService = 6;

      if (yearsOfService > 5) {
         double bonus = salary * 0.05;
         System.out.println("Bonus = " + bonus);
      } else {
         System.out.println("No bonus for less than 5 years of service.");
      }

      input.close();
   }
}
