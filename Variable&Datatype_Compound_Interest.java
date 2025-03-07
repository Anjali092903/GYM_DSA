import java.io.*;
import java.util.*;
class Solution {
    public void solve(Scanner sc) {
        // write your code here
         // Read inputs
        double P = sc.nextDouble(); // Principal Amount
        double T = sc.nextDouble(); // Time (years)
        double R = sc.nextDouble(); // Rate of Interest
        
        // Compute Compound Interest using formula: CI = P * (1 + R/100)^T
        double CI = P * Math.pow((1 + R / 100), T);
        
        // Print the result
        System.out.println("Compound interest = " + CI);

    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        solution.solve(sc);
    }
}


Compound Interest
Write a java program to calculate Compound Interest, Compound interest is the addition of interest to the principal sum of a loan or deposit, or in other words, interest on principal plus interest.

Formula to calculate compound interest annually is given by:

Compound Interest = P(1 + R/100)^r Where, P is principal amount R is the rate and T is the time span

Input Format
First line contains a single integer denoting the value of P. Second line contains a single integer denoting the value of T. The third line contains a single integer denoting the value of R.

Output Format
Return Compound Interest

Example 1
Input

400
55
9
Output

Compound interest = 45763.30464624552
Example 2
Input

800
6.8
7.55
Output

Compound interest = 1312.3232015379879  
Constraints
1 < = N < = 10^9

Topics
Basics
Java
Math
