import java.util.*;

class Main {

    // Function to reverse words in a string
    public static String reverseWords(String s) {
        // Split the string into an array of words
        String[] words = s.split(" ");

        // Create an empty string to store the result
        String result = "";

        // Loop through the words from the end to the beginning
        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i]; // Add the current word to the result
            if (i != 0) {
                result += " "; // Add a space after each word (except the last one)
            }
        }

        return result; // Return the final reversed string
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of test cases
        int t = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        while (t > 0) {
            // Read the input string
            String s = sc.nextLine();

            // Call the function and print the result
            System.out.println(reverseWords(s));

            t--; // Move to the next test case
        }
    }
}





Reverse String Word Wise
You are given a string S containing several space-separated words. You need to reverse the order of appearence of the words.

NOTE

You need to complete the given function. The input and printing of output will be handled by the driver code.

Input Format:
The first line contains the number of test cases.

For each test case: The first line has the string S.

Output Format
For each test case return the new reversed string.

Example 1
Input

1
how are you
Output

you are how
Explanation

We reverse the order of appearence.

Example 2
Input

1
gear fifth
Output

fifth gear
Explanation

We reverse the order of appearence.

Constraints
1 <= T <= 10

1 <= |S| <= 10000

Topics
Strings - Basics
Strings
Companies
Samsung
PayTM
Amazon
Goldman Sachs
Adobe
Cisco
MakeMyTrip
Microsoft
SAP
Accolite
