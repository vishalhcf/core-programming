import java.util.Scanner;

// Class to calculate bonus based on years of service
class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare variables
        double salary = 0.0;
        int yearsOfService = 0;
        double bonus = 0.0;

        // Take user input
        System.out.print("Enter employee salary: ");
        salary = input.nextDouble();

        System.out.print("Enter years of service: ");
        yearsOfService = input.nextInt();

        // Check for bonus eligibility
        if (yearsOfService > 5) {
            bonus = 0.05 * salary;
            System.out.println("Bonus is: ₹" + bonus);
        } else {
            System.out.println("No bonus awarded.");
        }

        input.close();
    }
}
