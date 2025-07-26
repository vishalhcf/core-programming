import java.util.*;
// Program to find pens per student and remainder
class PenDistribution {
    public static void main(String[] args) {

        // Declare total pens and number of students
        int totalPens = 14;
        int students = 3;

        // Calculate pens per student and remainder
        int pensPerStudent = totalPens / students;
        int remainingPens = totalPens % students;

        // Display result
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}
