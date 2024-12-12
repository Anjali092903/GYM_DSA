import java.util.*;
class Solution {
    public static int solve(int[] arr, int k) {
        // Initialize the maximum sum and the current window sum
        int maxSum = 0;
        int windowSum = 0;

        // Compute the sum of the first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;

        // Slide the window across the array
        for (int i = k; i < arr.length; i++) {
            // Update the window sum by adding the new element and removing the old element
            windowSum += arr[i] - arr[i - k];
            // Update the maximum sum if the current window sum is greater
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum; // Return the maximum sum
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Size of the array
        int k = sc.nextInt(); // Size of the subarray
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Solution.solve(arr, k));
    }
}




Max Sum Subarray of size K
Given an array of integers Arr of size N and a number, K. Return the maximum sum of a subarray of size K

Input
The first line contains 2 integers N and K The second line contains N integers denoting elements of the array

Output
Print an integer denoting the maximum sum subarray of size K

Example 1
Input:

4 2
100 200 300 400
Output:

 700
Explanation: The sum of the last 2 elements is maximum i.e. (0-based indexing) Arr[2]+Arr[3]=700 is maximum

Example 2
Input:

4 2
100 -200 300 -400
Output:

100
Explanation: Sum of Arr[1]+Arr[2]=((-200)+300=)100 which is the maximum sum possible for subarray of size 2

Constraints

1 <= N <= 1000000

1 <= K <= N

-10000 <= Arr[i] <= 10000

Topics
2-Pointers
Arrays
Companies
Oyo Rooms
