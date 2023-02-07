/*

The k-beauty of an integer num is defined as the number of substrings of num when it is read as a string that meet the following conditions:

It has a length of k.
It is a divisor of num.
Given integers num and k, return the k-beauty of num.

Note:

Leading zeros are allowed.
0 is not a divisor of any value.
A substring is a contiguous sequence of characters in a string.

 

Example 1:

Input: num = 240, k = 2
Output: 2
Explanation: The following are the substrings of num of length k:
- "24" from "240": 24 is a divisor of 240.
- "40" from "240": 40 is a divisor of 240.
Therefore, the k-beauty is 2.
Example 2:

Input: num = 430043, k = 2
Output: 2
Explanation: The following are the substrings of num of length k:
- "43" from "430043": 43 is a divisor of 430043.
- "30" from "430043": 30 is not a divisor of 430043.
- "00" from "430043": 0 is not a divisor of 430043.
- "04" from "430043": 4 is not a divisor of 430043.
- "43" from "430043": 43 is a divisor of 430043.
Therefore, the k-beauty is 2.

*/

import java.util.*;

public class d20p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        System.out.println(findDivisors(s, k));
        sc.close();
    }

    static int findDivisors(String s, int k) {
        int i = 0, j = 0;
        int ans = 0;
        while (j < s.length()) {
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                String sub = s.substring(i, j + 1);
                if (Integer.parseInt(sub) != 0
                        && Integer.parseInt(s) % Integer.parseInt(sub) == 0) {
                    ans++;
                }
                i++;
                j++;
            }
        }
        return ans;
    }
}
