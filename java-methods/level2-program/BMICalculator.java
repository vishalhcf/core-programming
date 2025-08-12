import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI from weight (kg) and height (cm)
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100; // convert cm to meters
        return weight / (heightM * heightM);
    }

    // Method to determine BMI status
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][3]; // [10][0]=weight, [1]=height, [2]=BMI
        String[] status = new String[10];

        // Input: weight and height
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for person " + (i + 1));

            System.out.print("Weight in kg: ");
            data[i][0] = sc.nextDouble();

            System.out.print("Height in cm: ");
            data[i][1] = sc.nextDouble();

            // Calculate and store BMI
            data[i][2] = calculateBMI(data[i][0], data[i][1]);

            // Store BMI status
            status[i] = getBMIStatus(data[i][2]);
        }

        // Output results
        System.out.println("\nBMI Report:");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n",
                    data[i][0], data[i][1], data[i][2], status[i]);
        }

        sc.close();
    }
}