import java.util.Scanner;

// Program Name: NumberClassification
// Purpose: Classify 5 numbers and compare the first and last elements
class NumberClassification {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare array to hold 5 numbers
        int[] numbers = new int[5];

        // Input loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Classify each number
        System.out.println("\nNumber Classification:");
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];

            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println("Number " + num + " is Positive and Even.");
                } else {
                    System.out.println("Number " + num + " is Positive and Odd.");
                }
            } else if (num < 0) {
                System.out.println("Number " + num + " is Negative.");
            } else {
                System.out.println("Number is Zero.");
            }
        }

        // Compare first and last
        System.out.println("\nComparison of First and Last Elements:");
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("First and last elements are equal.");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("First element is greater than the last.");
        } else {
            System.out.println("First element is less than the last.");
        }

        input.close();
    }
}
