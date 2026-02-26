import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        // convert string to character array
        char[] arr = original.toCharArray();

        // create another array for reverse
        char[] rev = new char[arr.length];


        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }

        String reversed = new String(rev);


        if (original.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("It is NOT a Palindrome");
        }

        sc.close();
    }
}