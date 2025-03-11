import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int month = sc.nextInt(); // Read month
        int year = sc.nextInt();  // Read year
        
        int days;

        // Check month and assign number of days
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                // Check for leap year
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                days = -1; // Invalid month case
        }

        System.out.println(days);
        sc.close();
    }
}



Days in a month
Write a program to print the number of days in a month.

Input format
- line contains the number of month from 1 to 12 
- line contains the year
Output format
print the number of days in the particular month in the particular year
Example 1
Input format

2
2016
Output format

29
Example 2
Input format

1
2009
Output format

31
Topics
Conditionals
