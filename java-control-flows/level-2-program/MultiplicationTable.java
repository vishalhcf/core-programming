import java.util.Scanner;

// Class to print multiplication table from 6 to 9
class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare variable for user number
        int number = 0;

        // Input number
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Print multiplication table
        for (int i = 6; i <= 9; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }

        input.close();
    }
}
