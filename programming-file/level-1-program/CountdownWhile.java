import java.util.*;
class CountdownWhile {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        // Countdown
        while (number >= 1) {
            System.out.println(number);
            number--;
        }
    }
}
