package MyProjects;

import java.util.Scanner;

// Adds a + b together. Simple.
// Concepts used: User Input
public class SimpleSum {
    public static void main(String[] args) {
        // User Input
        Scanner userInput = new Scanner(System.in);
        // Value a
        System.out.println("Enter a value: ");
        int a = userInput.nextInt();
        // Value b
        System.out.println("Enter another value: ");
        int b = userInput.nextInt();
        // Sum of a + b
        System.out.println("Output: " + (a + b));
    }
}
