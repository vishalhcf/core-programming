import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if the student can vote
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            // Negative age is invalid
            return false;
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] studentAges = new int[10];

        // Input ages of 10 students
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = sc.nextInt();

            // Check and print voting eligibility
            if (canStudentVote(studentAges[i])) {
                System.out.println("Student " + (i + 1) + " is eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " is NOT eligible to vote.");
            }
        }

        sc.close();
    }
}