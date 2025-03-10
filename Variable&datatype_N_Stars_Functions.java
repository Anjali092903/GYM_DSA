import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();  // Read the input value of n
        
        Solution obj = new Solution();
        obj.horizontalN(n);  // Print horizontal stars
        obj.verticalN(n);    // Print vertical stars
    }
}

class Solution {
    
    // Function to print n stars horizontally
    static void horizontalN(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("* "); // Print star followed by space for better readability
        }
        System.out.println();  // Move to a new line after printing horizontally
    }

    // Function to print n stars vertically
    static void verticalN(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*"); // Print star on a new line
        }
    }
}




N Stars Functions
In this task, you have to print n stars * vertically and n horizontally. You are given functions to complete. Donot worry about the input and ouput of functions just print n vertical stars in vertical and n horizontal stars in horizontal.

Note

Your task is to complete the functions verticalN() and horizontalN() given to print the stars.

Input Format
The first line of input contains n.

Output Format
print the stars in horizontal and vertical direction.

Example 1
Input

3
Output



Exaplantion

We print the 3 stars in horizontal and 3 stars vertical direction.

Example 2
Input

5
Output



Exaplantion

We print the 5 stars in horizontal and 5 stars vertical direction.

Constraints
1<= n <= 100

Topics
Basics
