import java.util.*;

class Solution {
  static int[] termsOfAP(int x) {
        int[] result = new int[x]; // Array to store the first X terms
        int count = 0; // Counter to keep track of valid terms found
        int N = 1; // Starting value for N

        while (count < x) { // Keep running until we get X valid terms
            int term = 3 * N + 2; // Calculate the term using formula T(N) = 3N + 2
            
            if (term % 4 != 0) { // Check if the term is NOT divisible by 4
                result[count] = term; // Store in the result array
                count++; // Increment valid terms counter
            }

            N++; // Move to the next value of N
        }

        return result; // Return the array of first X valid terms
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); 

        int[] ans = Solution.termsOfAP(x); // Call the function to get the series

        for(int i = 0; i < x; i++) { // Print the output in the required format
            if(i == x - 1) {
                System.out.print(ans[i] + "\n"); 
            } else {
                System.out.print(ans[i] + " "); 
            }
        }
    }
}




Terms of AP
Ayush is given a number X. He has been told that he has to find the first X terms of the series 3 * ‘N’ + 2, which are not multiples of 4. Help Ayush to find it as he has not been able to answer.

You have to complete termsOfAp function which consists of single integer input x and returns the array as output

Input Format
The first line of input will contain one integer, ‘X’ that denotes the number of terms he has to answer.

Output Format
The only line of output contains X space separated integers denoting the terms of series.

Example 1
Input

2
Output

5 11
Explanation

The first number is 5, while the second number cannot be 8 as it is divisible by 4, and so, the next number is directly 11 as it is not divisible by 4.

Example 2
Input

5
Output

5 11 14 17 23
Explanation

The first two numbers are 5 and 11. While following three numbers are 14, 17 and 23 for ‘N’ = 4, 5 and 7 respectively. 20 is divisible by 4, and thus, 20 cannot be included in the list.

Constraints
1 <= X <= 10^5

Topics
Math
Companies
TCS
