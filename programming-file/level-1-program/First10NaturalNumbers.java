import java.util.*;
class First10NaturalNumbers {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("First 10 natural numbers:");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            sum += i;
        }

        System.out.println("Sum: " + sum);
    }
}