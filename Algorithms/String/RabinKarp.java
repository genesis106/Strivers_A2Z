package Algorithms.String;

import java.util.ArrayList;
import java.util.List;

public class RabinKarp {

    // Function to calculate the hash value of a string
    private static long hashValue(String str) {
        long h = 0;
        long q = 101; // A prime number for modulo to reduce collisions
        int size = str.length();

        // Calculate hash by adding each character's value multiplied by its position
        for (int i = 0; i < size; i++) {
            h = (h * 10 + (str.charAt(i))) % q;
        }

        return h;
    }

    // Function to calculate the rolling hash when sliding the window
    private static long rollHash(long hash, char leftChar, char rightChar, long q) {
        // Subtract the left character's contribution (multiply by 10^position)
        hash = (hash - leftChar) * 10 + rightChar; // Multiply by 10 and add new character
        hash = hash % q; // Take modulo q to prevent overflow

        return hash;
    }

    // Function to find all occurrences of pattern in the text using Rabin-Karp
    public static List<Integer> rabinKarpSearch(String text, String pattern) {
        List<Integer> result = new ArrayList<>();
        int n = text.length();
        int m = pattern.length();
        long q = 101; // A prime number to reduce hash collisions
        long patternHash = hashValue(pattern);
        long currentHash = hashValue(text.substring(0, m));

        // If the pattern length is greater than the text length, no match is possible
        if (m > n) {
            return result;
        }

        // Check if the first window matches the pattern
        if (currentHash == patternHash && text.substring(0, m).equals(pattern)) {
            result.add(0); // Match found at index 0
        }

        // Precompute the value for 10^(m-1) for the rolling hash
        long power = 1;
        for (int i = 0; i < m - 1; i++) {
            power = (power * 10) % q;
        }

        // Slide over the text and update hash using rolling hash technique
        for (int i = m; i < n; i++) {
            // Roll the hash: remove the left character and add the right character
            currentHash = rollHash(currentHash, text.charAt(i - m), text.charAt(i), q);

            // If hashes match, check the actual strings to avoid collision
            if (currentHash == patternHash && text.substring(i - m + 1, i + 1).equals(pattern)) {
                result.add(i - m + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String text = "ababcababcabc";
        String pattern = "abc";

        // Perform Rabin-Karp search
        List<Integer> matches = rabinKarpSearch(text, pattern);

        // Print the indices where pattern is found
        if (matches.isEmpty()) {
            System.out.println("Pattern not found in the text.");
        } else {
            System.out.println("Pattern found at indices: " + matches);
        }
    }
}
