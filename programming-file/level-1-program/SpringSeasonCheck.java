import java.util.*;
class SpringSeasonCheck {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);

        // Month input
        int month = input.nextInt();

        // Spring season check
        boolean isSpring = (month >= 3 && month <= 5);
        System.out.println("Is it Spring season? " + isSpring);
    }
}