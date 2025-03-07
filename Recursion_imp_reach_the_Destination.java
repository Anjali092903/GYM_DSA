import java.util.*;

class Solution {
    static boolean reachDestination(int sx, int sy, int dx, int dy) {
        // Base case: If we have already reached the destination
        if (sx == dx && sy == dy) {
            return true;
        }
        
        // If we exceed the destination in either x or y direction, return false
        if (sx > dx || sy > dy) {
            return false;
        }

        // Recursively try both possible moves
        return reachDestination(sx + sy, sy, dx, dy) || reachDestination(sx, sx + sy, dx, dy);
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int dx = sc.nextInt();
        int dy = sc.nextInt();
        boolean ans = Solution.reachDestination(sx, sy, dx, dy);
        System.out.println(ans ? "True" : "False");
    }
}




Reach the Destination
Given a source point (sx, sy) and a destination point (dx, dy), the task is to check if it is possible to reach the destination point using the following valid moves:

(a, b) -> (a + b, b) (a, b) -> (a, a + b)

Your task is to find if it is possible to reach the destination point using only the desired moves or not. Print True if it is possible, if not print False.

Input Format
The only line of input contains four space-separated integers sx, sy, dx, and dy where sx, sy represents the coordinates of the source point and dx, dy represents the coordinates of the destination point.

Output Format
The only line of output will be True if the destination point can be reached from the source point using only the desired moves, else output False.

Example 1
Input

1 1 3 5
Output

True
Explanation

The output will be true as destination point can be reached using the following sequence of moves: (1, 1) -> (1, 2) -> (3, 2) -> (3, 5)

Example 2
Input

1 1 1 4
Output

True
Constraints
1 <= sx, sy, dx, dy <= 3000

Topics
Math
Companies
MAQ Software
