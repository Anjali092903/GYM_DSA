import java.util.*;

class Accio {
    public int HouseRobber(int[] nums) {
        int n = nums.length;

        // Edge cases
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);

        // Helper function to calculate max loot for linear houses
        return Math.max(robLinear(nums, 0, n - 2), robLinear(nums, 1, n - 1));
    }

    private int robLinear(int[] nums, int start, int end) {
        int prev2 = 0; // dp[i-2]
        int prev1 = 0; // dp[i-1]

        for (int i = start; i <= end; i++) {
            int current = Math.max(prev1, nums[i] + prev2);
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Accio Obj = new Accio();
        System.out.println(Obj.HouseRobber(arr));
    }
}





Case 1: Rob houses from [1, 2, 3] (indexes 0 to 2)
Using the House Robber logic:

At index 0 (nums[0] = 1): The maximum loot is 1.
At index 1 (nums[1] = 2): The maximum loot is max(1, 2) = 2.
At index 2 (nums[2] = 3): The maximum loot is max(2, 1 + 3) = max(2, 4) = 4.
Result for Case 1: 4.



  

House Robber 2
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have a security system connected, and it will automatically contact the police if two adjacent houses were broken into on the same night.

Take an integer array nums input that will represent the amount of money for each house, and print the maximum amount of money you can rob tonight without alerting the police.

Input Format
The first line contains integer N

The second line contains n integers arr[i].

Output Format
Print the maximum money you can rob.

EXAMPLE 1
Input

3
2 3 2
Output

3
EXPLANATION

You cannot rob house 1 (money = 2) and then rob house 3 (money = 2), because they are adjacent houses.

EXAMPLE 2
Input

4
1 2 3 1
Output:

4
EXPLANATION

Rob house 1 (money = 1) and then rob house 3 (money = 3).

The total amount you can rob = 1 + 3 = 4.

CONSTRAINTS
0 <= nums.length <= 15

0 <= nums[i] <= 1000

Topics
Dynamic Programming
Arrays
Companies
Amazon
Adobe
Apple
Google
Walmart Global Tech
Microsoft
eBay
