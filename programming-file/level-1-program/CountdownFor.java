import java.util.*;
class CountdownFor {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        // Countdown using for
        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        }
    }
}