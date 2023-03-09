// 1 test case failed

/*

Given an array of integers arr, you are initially positioned at the first index of the array.

In one step you can jump from index i to index:

i + 1 where: i + 1 < arr.length.
i - 1 where: i - 1 >= 0.
j where: arr[i] == arr[j] and i != j.
Return the minimum number of steps to reach the last index of the array.

Notice that you can not jump outside of the array at any time.

Example 1:

Example 1:
input =10
100 -23 -23 404 100 23 23 23 3 404
output =3
Explanation: You need three jumps from index 0 --> 4 --> 3 --> 9. Note that index 9 is the last index of the array.


input =1
7
output =0
Explanation: Start index is the last index. You do not need to jump.

input=8
7 6 9 6 9 6 9 7
output =1
Explanation: You can jump directly from index 0 to index 7 which is last index of the array.


Constraints:
1 <= arr.length <= 5 * 104
-108 <= arr[i] <= 108

*/

import java.util.*;
public class d36p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i < n; i++) {
            if (i + 1 < n) {
                dp[i + 1] = Math.min(dp[i + 1], dp[i] + 1);
            }
            if (i - 1 >= 0) {
                dp[i - 1] = Math.min(dp[i - 1], dp[i] + 1);
            }
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j] && i != j) {
                    dp[j] = Math.min(dp[j], dp[i] + 1);
                }
            }
        }
        System.out.println(dp[n - 1]);
        sc.close();
    }
}