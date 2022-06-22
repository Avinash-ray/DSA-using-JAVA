// 1. Each digit (0 to 9) denotes the student of the Optica Student community.
// 2. You are given a number n where ith digit denotes that ith task that is assigned to the corresponding digit student.
// 2. You are given a digit d denotes a student.
// 3. You are required to calculate the frequency of digit d in number n or how many tasks are assigned to student d.

// Constraints
// 0 <= n <= 10^9 0 <= d <= 9
// Example
// Sample Input
// 994543234
//  4

// Sample Output
// 3

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        // write code here
        int count= 0;
        while(n!= 0){
            int rem= n%10;
            if(rem == d){
                count++;
            }
            n= n/10;
        }
        return count;
    }
}