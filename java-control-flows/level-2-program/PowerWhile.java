import java.util.Scanner;

// Class to compute power using while loop
class PowerWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int base, power, result = 1, counter = 0;

        System.out.print("Enter base: ");
        base = input.nextInt();

        System.out.print("Enter power: ");
        power = input.nextInt();

        while (counter < power) {
            result *= base;
            counter++;
        }

        System.out.println(base + " raised to the power " + power + " = " + result);
        input.close();
    }
}
