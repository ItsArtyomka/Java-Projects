package HackerRankCoding.Introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Loops1 {
    // Logger because I wanted to apply new Java knowledge.
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) {
        // Try-with-resources
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(bufferedReader.readLine().trim());
            for (int i = 1; i <= 10; i++) {
//                System.out.println(N + " x " + i + " = " + N * i);
                System.out.printf("%d%s%d%s%d%n", N, " x ", i, " = ", N * i); // Nicer formatting
            }
        } catch (IOException e) {
            LOGGER.log(Level.WARNING, "IOException: " + e.getMessage());
        } catch (NumberFormatException e) {
            LOGGER.log(Level.WARNING, "Number Format Exception: " + e.getMessage());
        }
    }
}
