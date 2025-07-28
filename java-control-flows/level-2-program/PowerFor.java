import java.util.Scanner;

// Class to compute power of a number using for loop
class PowerFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int base, power, result = 1;

        System.out.print("Enter base: ");
        base = input.nextInt();

        System.out.print("Enter power: ");
        power = input.nextInt();

        for (int i = 1; i <= power; i++) {
            result *= base;
        }

        System.out.println(base + " raised to the power " + power + " = " + result);
        input.close();
    }
}
