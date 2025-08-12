import java.util.*;

public class OtpGenerator {

    // Method to generate one 6-digit OTP
    public static int generateOtp() {
        return 100000 + (int)(Math.random() * 900000);
    }

    // Method to generate 10 OTPs and store in array
    public static int[] generateOtpArray(int size) {
        int[] otps = new int[size];
        for (int i = 0; i < size; i++) {
            otps[i] = generateOtp();
        }
        return otps;
    }

    // Method to check if all OTPs in array are unique
    public static boolean areOtpsUnique(int[] otps) {
        Set<Integer> uniqueSet = new HashSet<>();
        for (int otp : otps) {
            uniqueSet.add(otp);
        }
        return uniqueSet.size() == otps.length;
    }

    // Display the OTPs
    public static void displayOtps(int[] otps) {
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }
    }

    public static void main(String[] args) {
        int[] otps = generateOtpArray(10);
        displayOtps(otps);
        System.out.println("\nAre all OTPs unique? " + areOtpsUnique(otps));
    }
}