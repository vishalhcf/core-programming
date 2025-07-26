import java.util.*;
// Program to compute volume of earth
class EarthVolume {
    public static void main(String[] args) {

        // Declare radius of earth in kilometers
        double radiusKm = 6378;

        // Declare pi and compute volume
        double pi = 3.14159;
        double volumeKm3 = (4.0 / 3) * pi * Math.pow(radiusKm, 3);

        // Convert volume to miles cube
        double volumeMiles3 = volumeKm3 / Math.pow(1.6, 3);

        // Display results
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}
