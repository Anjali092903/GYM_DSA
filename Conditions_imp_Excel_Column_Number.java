import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Solution solution = new Solution();
        System.out.println(solution.excelColumnNumber(s));
    }
}

class Solution {
    static long excelColumnNumber(String s) {
        long columnNumber = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int value = ch - 'A' + 1;  // Convert A=1, B=2, ..., Z=26
            columnNumber = columnNumber * 26 + value;
        }

        return columnNumber;
    }
}




Excel Column Number
Given a string A, output its corresponding column number in Excel. Check the examples for a better understanding of the question.

Input Format
The first line of the input contains the string A

Output Format
Output the corresponding column number of the string A

Example 1
Input

A
Output

1
Explanation

The column number of A is 1

Example 2
Input

AB
Output

28
Explanation

A = 1
B = 2
...
Z = 26
AA = 27
AB = 28
Constraints
1 <= |A| <= 13

Topics
Math
Companies
Samsung
PayTM
Amazon
Directi
Goldman Sachs
Microsoft
