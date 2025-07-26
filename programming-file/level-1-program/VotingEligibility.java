import java.util.*;
class VotingEligibility {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);

        // Age input
        int age = input.nextInt();

        // Eligibility
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }
}