import java.util.Arrays;

public class ZaraBonusCalculator {

    // Generate random salaries and years of service for 10 employees
    public static double[][] generateSalaryAndService(int employeeCount) {
        double[][] data = new double[employeeCount][2]; // [salary, yearsOfService]

        for (int i = 0; i < employeeCount; i++) {
            int salary = 10000 + (int)(Math.random() * 90000); // 5-digit salary
            int service = 1 + (int)(Math.random() * 10); // 1 to 10 years
            data[i][0] = salary;
            data[i][1] = service;
        }
        return data;
    }

    // Calculate bonus and new salary
    public static double[][] calculateBonusAndNewSalary(double[][] employeeData) {
        double[][] bonusData = new double[employeeData.length][2]; // [bonus, newSalary]

        for (int i = 0; i < employeeData.length; i++) {
            double salary = employeeData[i][0];
            int service = (int) employeeData[i][1];
            double bonus = 0;

            if (service > 5)
                bonus = salary * 0.05; // 5% bonus
            else
                bonus = salary * 0.02; // 2% bonus

            double newSalary = salary + bonus;
            bonusData[i][0] = bonus;
            bonusData[i][1] = newSalary;
        }

        return bonusData;
    }
}

    // Display results in table and total calculations
   