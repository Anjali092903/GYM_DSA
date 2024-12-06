import java.util.*;
import java.lang.*;

class Solution{
	public static int sum_of_digit(int n){
		// Write your code here
         // Base case: if n is 0, return 0
        if (n == 0) {
            return 0;
        }
         // Recursive case: add the last digit to the sum of the rest of the digits
        return n % 10 + sum_of_digit(n / 10);
	}
}
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution Ob = new Solution();
        System.out.println(Ob.sum_of_digit(n));
    }
}



Sum of Digits using Recursion
Write a function to find a way to determine the sum of the digits of a given number using recursion.

Input Format
The only line of input contains a single integer n.

Output Format
Print the sum of digits of the number using recursion.

Example 1
Input

1234
Output

10
Explanation

The sum of the digits in the number 1234 is calculated as follows: 1 + 2 + 3 + 4 = 10.

Example 2
Input

72
Output

9
Explanation

The sum of the digits in the number 72 is calculated as follows: 7 + 2 = 9.

Constraints
1 <= n <= 10^9

Topics
Coding
Recursion
