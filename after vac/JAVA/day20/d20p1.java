/*

Given a string s and an integer k, return the number of substrings in s of 
length k with no repeated characters.

Example 1:

Input: s = "havefunonleetcode", k = 5
Output: 6
Explanation: There are 6 substrings they are: 'havef','avefu','vefun','efuno','etcod','tcode'.
Example 2:



Input: s = "home", k = 5
Output: 0
Explanation: Notice k can be larger than the length of s. In this case, it is not possible to find any substring.
 

Constraints:

1 <= s.length <= 104
s consists of lowercase English letters.
1 <= k <= 104

*/

import java.util.*;

public class d20p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();
        System.out.println(findLen(str, k));
        sc.close();
    }

    static int findLen(String str, int k) {
        int len = 0, i = 0, j = 0;
        Set<Character> set = new HashSet<>();
        while (j < str.length()) {
            if (!set.contains(str.charAt(j)))
                set.add(str.charAt(j++));
            else
                set.remove(str.charAt(i++));
            if (set.size() == k) {
                len++;
                set.remove(str.charAt(i++));
            }
        }
        return len;
    }
}
