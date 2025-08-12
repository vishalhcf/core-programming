import java.util.Scanner;

public class LeapYearChecker {

    // Method to check whether a year is a leap year
    public static boolean isLeapYear(int year) {
        // Check valid Gregorian calendar year
        if (year < 1582) {
            return false;
        }

        // Leap year condition:
        // Divisible by 4 and not divisible by 100 unless divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a year (≥ 1582): ");
        int year = sc.nextInt();

        // Validate
        if (year < 1582) {
            System.out.println("❌ Invalid year. Leap year check only applies for year ≥ 1582 (Gregorian calendar).");
            return;
        }

        // Output
        if (isLeapYear(year)) {
            System.out.println(year + " is a ✅ Leap Year.");
        } else {
            System.out.println(year + " is ❌ Not a Leap Year.");
        }
    }
}