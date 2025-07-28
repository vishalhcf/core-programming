import java.util.Scanner;

// Class to find all factors of a number using for loop
class FactorsFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter a positive number: ");
        number = input.nextInt();

        if (number > 0) {
            System.out.println("Factors of " + number + " are:");
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Enter a valid positive number.");
        }

        input.close();
    }
}
