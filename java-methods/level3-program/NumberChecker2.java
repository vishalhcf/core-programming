import java.util.*;

public class NumberChecker2 {

    // Method to count digits
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    // Method to extract digits to array
    public static int[] getDigits(int number) {
        String str = String.valueOf(Math.abs(number));
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }
        return digits;
    }

    // Method to calculate sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to calculate sum of squares of digits
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if number is Harshad
    public static boolean isHarshadNumber(int number, int[] digits) {
        int digitSum = sumOfDigits(digits);
        return digitSum != 0 && number % digitSum == 0;
    }

    // Method to find digit frequency and return 2D array
    public static int[][] digitFrequency(int[] digits) {
        int[] freq = new int[10]; // 0 to 9 digits
        for (int digit : digits) {
            freq[digit]++;
        }

        int count = 0;
        for (int f : freq) {
            if (f > 0) count++;
        }

        int[][] frequencyTable = new int[count][2];
        int index = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                frequencyTable[index][0] = i;        // digit
                frequencyTable[index][1] = freq[i];  // frequency
                index++;
            }
        }
        return frequencyTable;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int digitCount = countDigits(number);
        int[] digits = getDigits(number);

        System.out.println("\nTotal digits: " + digitCount);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));
        System.out.println("Is Harshad Number? " + isHarshadNumber(number, digits));

        int[][] frequency = digitFrequency(digits);
        System.out.println("Digit Frequencies:");
        System.out.println("Digit\tFrequency");
        for (int[] row : frequency) {
            System.out.println(row[0] + "\t" + row[1]);
        }

        sc.close();
    }
}
