import java.util.*;
class NumberSignCheck {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);

        // Input number
        int number = input.nextInt();

        if (number > 0) {
            System.out.println("Positive number");
        } else if (number < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }
    }
}
