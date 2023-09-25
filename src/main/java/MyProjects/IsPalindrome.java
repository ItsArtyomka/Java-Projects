package MyProjects;

import java.util.Scanner;
public class IsPalindrome {
    @SuppressWarnings("StringConcatenationInLoop")
    public static void main(String[] args) {
        // User Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check if it's palindrome: ");

        // Variables
        String str1 = scanner.next();
        String str2 = "";

        // Reversing a string
        for (int i = str1.length() - 1; i >= 0; i--) {
            str2 = str2 + str1.charAt(i);
        }
        System.out.println("Reversed String: " + str2); // Reversed String Output

        // Checking if Input is/isn't Palindrome
        if (str2.equals(str1)) {
            System.out.println("True, \"" + str2 + "\" is Palindrome.");
        } else {
            System.out.println("False, \"" + str2 + "\" is not Palindrome.");
        }
    }
}
