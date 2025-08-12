import java.util.*;

class ToCharArrayCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] arr1 = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr1[i] = text.charAt(i);
        }

        char[] arr2 = text.toCharArray();

        boolean same = true;
        if (arr1.length != arr2.length) same = false;
        else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    same = false;
                    break;
                }
            }
        }

        System.out.println("Arrays match? " + same);
    }
}