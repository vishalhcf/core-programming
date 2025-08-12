import java.util.*;

public class FootballTeamHeightStats {

    // Method to generate random heights between 150 and 250 cm
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = (int)(Math.random() * 101) + 150; // 150 to 250
        }
        return heights;
    }

    // Method to calculate sum of heights
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int height : arr) {
            sum += height;
        }
        return sum;
    }

    // Method to calculate mean height
    public static double calculateMean(int[] arr) {
        int sum = calculateSum(arr);
        return (double) sum / arr.length;
    }

    // Method to find shortest height
    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int height : arr) {
            if (height < min)
                min = height;
        }
        return min;
    }

    // Method to find tallest height
    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int height : arr) {
            if (height > max)
                max = height;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11);

        System.out.println("Player Heights (in cm): " + Arrays.toString(heights));

        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        double mean = calculateMean(heights);

        System.out.println("\nShortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
        System.out.println("Mean Height: " + String.format("%.2f", mean) + " cm");
    }
}