/*

Given a string s, return the number of homogenous substrings of s. Since the answer may be too large, 
return it modulo 109 + 7.

A string is homogenous if all the characters of the string are the same.

A substring is a contiguous sequence of characters within a string.



Example 1:
input =abbcccaa
output =13

Explanation: The homogenous substrings are listed as below:
"a"   appears 3 times.
"aa"  appears 1 time.
"b"   appears 2 times.
"bb"  appears 1 time.
"c"   appears 3 times.
"cc"  appears 2 times.
"ccc" appears 1 time.
3 + 1 + 2 + 1 + 3 + 2 + 1 = 13.


Input: s = "xy"
Output: 2
Explanation: The homogenous substrings are "x" and "y".
Example 3:

Input: s = "zzzzz"
Output: 15


Constraints:

1 <= s.length <= 105
s consists of lowercase letters.


*/

import java.util.*;

public class d33p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(countHomo(s));
        sc.close();
    }

    static int countHomo(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int val = entry.getValue();
            count += (val * (val + 1)) / 2;
        }
        return count;
    }
}

