import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    // Function to find two indices such that their sum equals the target
    public static int[] twoSum(int[] A, int target) {
        // Initialize two pointers: left starts at the beginning, right at the end
        int left = 0;
        int right = A.length - 1;

        // Continue the loop until the pointers meet
        while (left < right) {
            // Calculate the sum of elements at the left and right pointers
            int sum = A[left] + A[right];

            // If the sum matches the target, return the 1-indexed positions
            if (sum == target) {
                return new int[] { left + 1, right + 1 }; // Convert to 1-indexed
            } 
            // If the sum is less than the target, move the left pointer to the right
            else if (sum < target) {
                left++;
            } 
            // If the sum is greater than the target, move the right pointer to the left
            else {
                right--;
            }
        }

        // If no solution exists (though problem guarantees one), return [-1, -1]
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read the size of the array
        long n = Long.parseLong(br.readLine().trim());

        // Read the array elements
        String inputLine[] = br.readLine().trim().split(" ");
        int[] arr = new int[(int) n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(inputLine[i]);

        // Read the target value
        int target = Integer.parseInt(br.readLine().trim());

        // Call the twoSum function and store the result
        int[] ans = twoSum(arr, target);

        // Print the result
        System.out.println(ans[0] + " " + ans[1]);
    }
}









Two Sum
You are given a non-decreasing array A of N integers. You are given another integer target.

You have to find two unique indices of the array such that the values at those indices have a sum equal to target.

Return the indices as a sorted integer array of size 2.

It is guaranteed that the test cases are made such that only one solution exists.

The array is 1-indexed.

Note Complete the given function. The input and output would be handled by the driver code.

Your solution must use only constant extra space.

Input Format
The first line contains a single integer N.

The second line contains N space-separated integers of array A.

The third line contains a single integer target.

Output Format
Print the answer in a new line.

Example 1
Input

4
1 2 3 4
6
Output

2 4
Explanation

A[2] = 2. A[4] = 4. 2 + 4 = 6.

Example 2
Input

5
-10 1 2 5 7
3
Output

2 3
Explanation

A[2] = 1. A[3] = 2. 1 + 2 = 3.

Constraints
1 <= N <= 10000

-100000 <= A[i] <= 100000

-200000 <= target <= 200000

Topics
2-Pointers
Arrays
Companies
Visa
Intuit
Citadel
Facebook
Spotify
Samsung
PayTM
IBM
Dell
Intel Tcs
Paypal
CISCO
Goldman Sachs
Twitter
Bloomberg
Oracle
Adobe
EPAM System
VMware
Apple
Nagarro
JPMorgan
Optum
Uber
Snapchat
Google
Walmart Global Tech
Microsoft
Morgan Stanley
LinkedIn
Salesforce
Expedia
American Express
Nvidia
Cognizant
