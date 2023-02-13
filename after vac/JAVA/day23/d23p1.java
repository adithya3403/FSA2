/*

Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <=
n), ans[i] is the number of 1's in the binary representation of i.

Input: n = 2
Output: [0,1,1]

Explanation:
0 --> 0
1 --> 1
2 --> 10

Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101

*/

import java.util.*;

public class d23p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findOnes(n));
        // for (int i = 0; i <= n; i++) System.out.print(Integer.bitCount(i) + " ");
        sc.close();
    }

    static List<Integer> findOnes(int n) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            if (i == 0)
                ans.add(0);
            else if (i == 1)
                ans.add(1);
            else if (i % 2 == 0)
                ans.add(ans.get(i / 2));
            else
                ans.add(ans.get(i / 2) + 1);
        }
        return ans;
    }
}
