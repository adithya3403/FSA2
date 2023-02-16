/*

Given a positive integer n, you can apply one of the following operations:

If n is even, replace n with n / 2.
If n is odd, replace n with either n + 1 or n-1 .
Return the minimum number of operations needed for n to become 1.
Example 1:

Input: n = 8
Output: 3
Explanation: 8 -> 4 -> 2 -> 1
Example 2:

Input: n = 7
Output: 4
Explanation: 7 -> 8 -> 4 -> 2 -> 1
or 7 -> 6 -> 3 -> 2 -> 1

*/

import java.util.*;

public class d25p2 {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int n = sc.nextInt(), c = 0;
        for (; n != 1; c++)
            n = (n & 1) == 0 ? n >> 1 : (n & 2) == 0 || n == 3 ? n - 1 : n + 1;
        System.out.println(c);
        sc.close();
    }
}
