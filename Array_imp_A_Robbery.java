import java.util.*;

class Solution {
    public int maxAmount(int[] a) {
        int n = a.length;

        // Base cases
        if (n == 1) return a[0];
        if (n == 2) return Math.max(a[0], a[1]);

        // Initialize variables to store previous two results
        int prev2 = a[0]; // dp[i-2]
        int prev1 = Math.max(a[0], a[1]); // dp[i-1]

        // Iteratively calculate the max amount using the formula
        for (int i = 2; i < n; i++) {
            int current = Math.max(prev1, a[i] + prev2); // dp[i] = max(dp[i-1], a[i] + dp[i-2])
            prev2 = prev1;
            prev1 = current;
        }

        return prev1; // The maximum amount is stored in prev1
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        Solution obj = new Solution();
        System.out.println(obj.maxAmount(a));
        sc.close();
    }
}





A Robbery
Robin the thief wants to loot money from a society having n houses in a single line.

He is a weird person and follows a certain rule when looting the houses.

According to the rule, he will never loot two consecutive houses.

At the same time, he wants to maximize the amount he loots.

The thief knows which house has what amount of money but is unable to come up with an optimal looting strategy.

He asks for your help to find the maximum money he can get if he strictly follows the rule. Each house has a[i] amount of money present in it.

Input Format
The first input line contains integer n, the lenght of array a.

The following line contains n space separated integers representing a[i] which is the amount of money in each house.

Output Format
Return one integer — the maximum amount Robin can loot.

Example 1
Input

6
5 5 10 100 10 5 
Output

110
Explanation

He robs the houses 1,3,5 to get the amount 5+100+5=110.
Example 2
Input

3
1 2 3 
Output

4
Explanation

He robs the houses 0 and 2 to get the amount 1+3=4.
Constraints
1 ≤ n ≤ 10^4

1 ≤ a[i] ≤ 10^4

Topics
Dynamic Programming
Arrays
Companies
PayTM
Amazon
Flipkart
Google
Walmart Global Tech
