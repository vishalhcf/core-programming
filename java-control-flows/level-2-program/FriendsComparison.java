import java.util.Scanner;

// Class to find the youngest and tallest among 3 friends
class FriendsComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare variables for names
        String name1 = "Amar", name2 = "Akbar", name3 = "Anthony";

        // Declare age variables
        int age1, age2, age3;

        // Declare height variables
        double height1, height2, height3;

        // Input age and height for each
        System.out.print("Enter age of Amar: ");
        age1 = input.nextInt();
        System.out.print("Enter height of Amar: ");
        height1 = input.nextDouble();

        System.out.print("Enter age of Akbar: ");
        age2 = input.nextInt();
        System.out.print("Enter height of Akbar: ");
        height2 = input.nextDouble();

        System.out.print("Enter age of Anthony: ");
        age3 = input.nextInt();
        System.out.print("Enter height of Anthony: ");
        height3 = input.nextDouble();

        // Find youngest
        String youngest = name1;
        if (age2 < age1 && age2 < age3) youngest = name2;
        else if (age3 < age1 && age3 < age2) youngest = name3;

        // Find tallest
        String tallest = name1;
        if (height2 > height1 && height2 > height3) tallest = name2;
        else if (height3 > height1 && height3 > height2) tallest = name3;

        // Output
        System.out.println("Youngest: " + youngest);
        System.out.println("Tallest: " + tallest);

        input.close();
    }
}
