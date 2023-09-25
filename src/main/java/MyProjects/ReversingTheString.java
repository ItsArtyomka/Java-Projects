package MyProjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Concepts used: User Input, try/catch, StringBuilder
public class ReversingTheString {
    public static void main(String[] args) {
        // Overcomplicated user input this time ;)
        System.out.println("Enter a string to be reversed: ");
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        String orig = null;
        try {
            orig = userInput.readLine();
        } catch (IOException e) { // Not really need I think.
            System.out.println("Input Error: " + e.getMessage());
        }

        // Reversing the string using StringBuilder.
        assert orig != null; // Assuming input is not null.
        StringBuffer reversed = new StringBuffer(orig);
        System.out.println("Reversed string: ");
        System.out.println(reversed.reverse());
    }
}
