import java.util.*;

public class NumberChecker {

    // Method to count number of digits
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to store digits in an array
    public static int[] getDigits(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    // Method to check for Duck Number
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {  // Duck number must not start with 0
            if (digits[i] == 0) return true;
        }
        return false;
    }

    // Method to check Armstrong number
    public static boolean isArmstrong(int number, int[] digits) {
        int n = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, n);
        }
        return sum == number;
    }

    // Method to find largest and second largest digit
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > max) {
                secondMax = max;
                max = digit;
            } else if (digit > secondMax && digit != max) {
                secondMax = digit;
            }
        }
        return new int[] { max, secondMax };
    }

    // Method to find smallest and second smallest digit
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < min) {
                secondMin = min;
                min = digit;
            } else if (digit < secondMin && digit != min) {
                secondMin = digit;
            }
        }
        return new int[] { min, secondMin };
    }

    // Main method to test the utility
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int digitCount = countDigits(number);
        int[] digits = getDigits(number);

        System.out.println("\nTotal Digits: " + digitCount);
        System.out.println("Digits: " + Arrays.toString(digits));

        System.out.println("Is Duck Number? " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number? " + isArmstrong(number, digits));

        int[] maxPair = findLargestAndSecondLargest(digits);
        System.out.println("Largest Digit: " + maxPair[0]);
        System.out.println("Second Largest Digit: " + (maxPair[1] == Integer.MIN_VALUE ? "Not found" : maxPair[1]));

        int[] minPair = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest Digit: " + minPair[0]);
        System.out.println("Second Smallest Digit: " + (minPair[1] == Integer.MAX_VALUE ? "Not found" : minPair[1]));

        sc.close();
    }
}