import java.util.Scanner;

// Class to find all multiples of a number below 100 using for loop
class MultiplesBelow100For {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter a positive number less than 100: ");
        number = input.nextInt();

        if (number > 0 && number < 100) {
            System.out.println("Multiples of " + number + " below 100:");
            for (int i = 1; i < 100; i++) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Invalid input.");
        }

        input.close();
    }
}
