import java.util.*;
class EmployeeBonus {
    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Get salary and years of service
        double salary = input.nextDouble();
        int years = input.nextInt();

        // Calculate bonus if applicable
        if (years > 5) {
            double bonus = 0.05 * salary;
            System.out.println("Bonus: " + bonus);
        } else {
            System.out.println("No bonus for less than 5 years");
        }
    }
}