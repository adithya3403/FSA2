/*

Sharath is playing a game where there are N levels. Initially at Level-1. 
In order to win the game he has to reach the Nth level.

According to the game rules, in one step :
    - He can complete one level at a time (OR)
    - He can jump from the current level 'L' to 'L*2' level, by losing 1 diamond.  

The game has N levels and Sharath is given D diamonds.
Find the least number of steps required to finish the game by Sharath.
And print the number of steps.

Input Format:
-------------
Two space separated integers, N and D

Output Format:
--------------
Print an integer result.


Sample Input-1:
---------------
7 1

Sample Output-1:
----------------
4

Explanation: 
------------
Sharath is at level-1, 
Step-1: He can complete level-1 and move to level-2
Step-2: He can complete level-2 and move to level-3
Step-3: He can use the diamond and jump to level-(3*2) => level-6
Step-4: He can complete level-6 and move to level-7, He wins the game.


Sample Input-2:
---------------
23 3

Sample Output-2:
----------------
7

Algorithm: 
The solution to this problem can be solved using dynamic programming.

Create an array 'steps' of size N+1 and initialize all elements to -1.
Set steps[1] = 0, as the initial level is level 1 and 0 steps are required to reach level 1.
Starting from level 2, check if the current level is less than or equal to twice the previous level.
If yes, then check if the number of diamonds required to reach the current level is greater than the number of diamonds available.
If yes, then set steps[i] = steps[i-1] + 1.
Else, set steps[i] = min(steps[i-1], steps[i/2] + 1) + 1.
Repeat step 3 for all levels from 2 to N.
Return the value of steps[N].
The number of steps will be the minimum of either completing each level one by one or skipping some levels using diamonds.
The above algorithm finds the minimum number of steps required to finish the game.

*/

import java.util.*;

public class d2p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        int[] steps = new int[N + 1];
        Arrays.fill(steps, -1);
        steps[1] = 0;
        for (int i = 2; i <= N; i++) {
            if (i <= 2 * steps[i - 1]) {
                if (D > 0) {
                    steps[i] = steps[i - 1] + 1;
                    D--;
                } else {
                    steps[i] = steps[i - 1];
                }
            } else {
                steps[i] = Math.min(steps[i - 1], steps[i / 2] + 1) + 1;
            }
        }
        System.out.println(steps[N]);
        sc.close();
    }
}