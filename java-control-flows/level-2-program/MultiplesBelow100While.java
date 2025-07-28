import java.util.Scanner;

// Class to find all multiples below 100 using while loop
class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, i = 1;

        System.out.print("Enter a positive number less than 100: ");
        number = input.nextInt();

        if (number > 0 && number < 100) {
            System.out.println("Multiples of " + number + " below 100:");
            while (i < 100) {
                if (i % number == 0) {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("Invalid input.");
        }

        input.close();
    }
}
