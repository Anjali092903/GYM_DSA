import java.util.*;

public class Main {
    public static void main(String args[]) {
        // Taking input
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        sc.close(); // Close scanner

        // Calculate power using custom method
        long ans = Solution.Pow(x, n);
        System.out.println(ans);
    }
}

class Solution {
    static long Pow(int X, int N) {
        if (X == 0 && N == 0) {
            return 1; // 0^0 is defined as 1
        }
        long result = 1;
        for (int i = 0; i < N; i++) {
           result = result * X;
   }
        return result;
    }
}




Find power of a number
Ninja is sitting in an examination hall. He is encountered with a problem statement, "Find ‘X’ to the power ‘N’ (i.e. ‘X’ ^ ‘N’). Where ‘X’ and ‘N’ are two integers." Ninja was not prepared for this question at all, as this question was unexpected in the exam. He is asking for your help to solve this problem. Help Ninja to find the answer to the problem.

Note

For this question, you can assume that 0 raised to the power of 0 is 1.

Input format
The first line of input contains two integers ‘X’ and ‘N’ (separated by space).

Output Format
The only line of output will contain a single integer which will be equal to X ^ N (i.e. X raise to the power N).

Example 1
Input

5 2
Output

25
Explanation

Given X = 5 and N = 2. So, 5 ^ 2 = 25. As 5 * 5 = 25.

Example 2
Input

9 3
Output

729
Explanation

Given X = 9 and N = 3. So, 9 ^ 3 = 729. As 9 * 9 * 9 = 729.

Constraints
0 <= X <= 10

0 <= N <= 10

Topics
Math
Companies
Cognizant
