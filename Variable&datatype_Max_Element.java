import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Read the input line and split it into an array of strings
        String[] input = br.readLine().split(" ");
        
        int maxElement = Integer.MIN_VALUE;  // Initialize with the smallest possible integer
        
        // Iterate through the input array to find the maximum element
        for (String num : input) {
            int value = Integer.parseInt(num);  // Convert string to integer
            if (value > maxElement) {
                maxElement = value;
            }
        }
        
        // Print the maximum element found
        System.out.println(maxElement);
    }
}




Max Element
Given an array of integers, you need to find its maximum value element.

Input
The input contains N-spaced integers. There is no size of the array given beforehand. You will have to use some other way of reading input values.

Output
Print the largest element present in the array.

Example 1
Input

8 1 2 3 4 
Output

8 
Example 2
Input

8 2 4 6 9
Output

9
Constraints
1 < = N < = 1000
1 < = Arr[i] < = 10000
Topics
Basics
