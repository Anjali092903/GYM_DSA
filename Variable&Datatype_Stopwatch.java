import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }

        Solution s = new Solution();
        System.out.println(s.stopwatch(a));
        input.close();
    }
}

class Solution {
    static String stopwatch(int[] a) {
        if (a.length % 2 != 0) {
            return "still running"; // If odd number of presses, stopwatch is still running
        }

        int totalTime = 0;
        for (int i = 0; i < a.length; i += 2) {
            totalTime += (a[i + 1] - a[i]); // Time difference when stopped
        }

        return String.valueOf(totalTime);
    }
}



Stopwatch
Robin just received a stopwatch from her grandfather. Robin’s stopwatch has a single button. Pressing the button alternates between stopping and starting the stopwatch’s timer. When the timer is on, the displayed time increases by 1 every second.

Initially, the stopwatch is stopped and the timer reads 0 seconds. Given a sequence of times that the stopwatch button is pressed, determine what the stopwatch’s timer displays, if stopped. If it's still running, print "still running".

Input Format
The first line of input contains a single integer N, which is the number of times the stopwatch was pressed.

The next N lines describe the times the stopwatch’s button was pressed in increasing order. Each line contains a single integer t, which is the time the button was pressed. No two button presses happen in the same second.

Output Format
Print "still running" if the stopwatch’s timer is still running after all button presses were made. Otherwise, display the number of seconds the face of the stopwatch.

Example 1
Input

2
7
11
Output

4
Explanation

The stopwatch’s timer starts at 0 seconds. After 7 seconds, the button is pressed, and the timer starts. After 11 seconds, the button is pressed again, and the timer stops. The stopwatch’s timer displays 4 seconds.

Example 2
Input

5
2
5
9
10
17
Output

still running
Explanation

The stopwatch’s timer starts at 0 seconds. After 2 seconds, the button is pressed, and the timer starts. After 5 seconds, the button is pressed again, and the timer stops. After 9 seconds, the button is pressed, and the timer starts. After 10 seconds, the button is pressed again, and the timer stops. After 17 seconds, the button is pressed, and the timer starts. The stopwatch’s timer is still running.

Constraints
1 <= N <= 1000

1 <= t <= 10^6

Topics
Conditionals
