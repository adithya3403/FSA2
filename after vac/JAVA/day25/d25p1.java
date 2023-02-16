/*

Given a string s, return true if a permutation of the string could form a palindrome and false otherwise.

Example 1:

Input: s = "code"
Output: false

Example 2:
Input: s = "aab"
Output: true
Example 3:

Input: s = "carerac"
Output: true
 

Constraints:

1 <= s.length <= 5000
s consists of only lowercase English letters.

*/

import java.util.*;

public class d25p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // System.out.println(usingMap(s));
        // System.out.println(usingSet(s));
        System.out.println(usingBitManipulation(s));
        sc.close();
    }

    static boolean usingMap(String s) {
        int[] map = new int[26];
        for (int i = 0; i < s.length(); i++)
            map[s.charAt(i) - 'a']++;
        int odd = 0;
        for (int i = 0; i < 26; i++)
            if (map[i] % 2 != 0)
                odd++;
        return odd <= 1;
    }

    static boolean usingSet(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++)
            if (!set.contains(s.charAt(i)))
                set.add(s.charAt(i));
        return set.size() <= 1;
    }

    static boolean usingBitManipulation(String s) {
        BitSet bs = new BitSet(26);
        for (int i = 0; i < s.length(); i++)
            bs.flip(s.charAt(i) - 'a');
        return bs.cardinality() <= 1;
    }
}
