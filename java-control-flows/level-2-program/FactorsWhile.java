import java.util.Scanner;

// Class to find factors using while loop
class FactorsWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, i = 1;

        System.out.print("Enter a positive number: ");
        number = input.nextInt();

        if (number > 0) {
            System.out.println("Factors of " + number + " are:");
            while (i <= number) {
                if (number % i == 0) {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("Invalid input.");
        }

        input.close();
    }
}
