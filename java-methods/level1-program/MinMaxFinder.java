import java.util.Scanner;

public class MinMaxFinder {
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = Math.min(number1, Math.min(number2, number3));
        int largest = Math.max(number1, Math.max(number2, number3));
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter third number: ");
        int num3 = input.nextInt();

        int[] result = findSmallestAndLargest(num1, num2, num3);
        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);

        input.close();
    }
}
