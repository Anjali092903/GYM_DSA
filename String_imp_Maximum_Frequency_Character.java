import java.util.*;

public class Main {
    
    static char MaximumFrequencyChar(String s) {
        // Create an array to count the frequency of each character
        int[] freq = new int[26];  // Array of size 26 for lowercase English letters

        // Count the frequency of each character in the string
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Find the character with the highest frequency, 
        // in case of tie, the lexicographically smallest character
        int maxFreq = 0;
        char result = 'a';

        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                result = (char) (i + 'a');
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Take input from the user
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        // Output the character with the highest frequency
        System.out.println(MaximumFrequencyChar(s));
    }
}




Maximum Frequency Character
Given a string s containing lowercase alphabets, return the character with the highest occurrence in s.

If there are multiple such characters, then return the lexicographically smallest one of them.

Input Format
The only line of the input contains the string s.

Output Format
Print the maximal occurring character in the string s. If there are multiple, print the lexicographically minimum one.

Example 1
Input

abbbc
Output

b
Explanation

Here, a occurs 1 time, c occurs 1 time, and b occurs 3 times. Hence our answer for this is b.

Example 2
Input

aabbbccc
Output

b
Constraints
1 < s.length() < 100

Topics
Strings - Basics
Strings
Companies
Morgan Stanley
