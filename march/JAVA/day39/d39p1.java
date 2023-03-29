// Grade 83.33

/*

There are n persons on a social media website. 

You are given an integer array ages where ages[i] is the age of the ith person.

A Person x will not send a friend request to a person y (x != y) 
if any of the following conditions is true:

age[y] <= 0.5 * age[x] + 7
age[y] > age[x]
age[y] > 100 && age[x] < 100

Otherwise, x will send a friend request to y.

Note that if x sends a request to y, y will not necessarily send a request to x.
Also, a person will not send a friend request to themself.

Return the total number of friend requests made.

Example 1:
Input: ages = [16,16]
Output: 2
Explanation: 2 people friend request each other.

Example 2:
Input: ages = [16,17,18]
Output: 2
Explanation: Friend requests are made 17 -> 16, 18 -> 17.


Example 3:
Input: ages = [20,30,100,110,120]
Output: 3
Explanation: Friend requests are made 110 -> 100, 120 -> 110, 120 -> 100.
 

Constraints:

n == ages.length
1 <= n <= 2 * 104
1 <= ages[i] <= 120

*/

import java.util.*;

public class d39p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }
        System.out.println(numFriendRequests(ages));
        sc.close();
    }

    static int numFriendRequests(int[] ages) {
        int[] count = new int[121];
        for (int age : ages) {
            count[age]++;
        }
        int res = 0;
        for (int i = 15; i <= 120; i++) {
            int countA = count[i];
            for (int j = i / 2 + 8; j <= i; j++) {
                int countB = count[j];
                if (countA == 0 || countB == 0) {
                    continue;
                }
                if (i == j) {
                    res += countA * (countA - 1);
                } else {
                    res += countA * countB;
                }
            }
        }
        return res;
    }
}
