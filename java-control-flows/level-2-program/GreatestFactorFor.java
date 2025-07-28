import java.util.Scanner;

// Class to find the greatest factor other than the number itself using for loop
class GreatestFactorFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, greatestFactor = 1;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        System.out.println("Greatest factor of " + number + " (excluding itself): " + greatestFactor);

        input.close();
    }
}
