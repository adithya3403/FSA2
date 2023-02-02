/*

A string is good if there are no repeated characters.
Given a string s, return the number of good substrings of length three in s.
Note that if there are multiple occurrences of the same substring, every occurrence should be counted.
A substring is a contiguous sequence of characters in a string.
 

Example 1:
input: s = "xyzzaz"
output: 1

Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz". 
The only good substring of length 3 is "xyz".


Example 2:
Input: s = "aababcabc"
Output: 4
Explanation: There are 7 substrings of size 3: "aab", "aba", "bab", "abc", "bca", "cab", and "abc".
The good substrings are "abc", "bca", "cab", and "abc".


*/

import java.util.*;

public class d16p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int i = 0, j = 0, count = 0;
        Set<Character> set = new HashSet<>();
        // List<String> list = new ArrayList<>();
        while (j < str.length()) {
            if (set.contains(str.charAt(j))) {
                set.remove(str.charAt(i++));
            } else {
                set.add(str.charAt(j++));
                if (j - i == 3) {
                    // list.add(str.substring(i, j));
                    count++;
                    set.remove(str.charAt(i++));
                }
            }
        }
        // System.out.println(list);
        System.out.println(count);
        sc.close();
    }
}