import java.util.Scanner;

// Class to find greatest factor using while loop
class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, counter, greatestFactor = 1;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        counter = number - 1;

        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }

        System.out.println("Greatest factor of " + number + " (excluding itself): " + greatestFactor);

        input.close();
    }
}
