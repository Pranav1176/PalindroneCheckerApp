import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        String reverse = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }

        System.out.println("Reversed string: " + reverse);

        if (original.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("NOT a Palindrome");
        }

        sc.close();
    }
}