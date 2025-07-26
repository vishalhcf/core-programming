import java.util.Scanner;

// Program to calculate max handshakes among students
class MaxHandshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare variable
        int numberOfStudents;

        // Take input
        System.out.print("Enter number of students: ");
        numberOfStudents = input.nextInt();

        // Calculate handshakes using combination formula
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display result
        System.out.println("The maximum number of possible handshakes is " + handshakes);
    }
}
