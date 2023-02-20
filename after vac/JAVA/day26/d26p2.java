/*

Given two strings s and p, return an array of all the start indices of p's anagrams in s. 
You may return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.


input =cbaebabacd
abc
output =0 6
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".

input=abab
ab
output =0 1 2

Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".

*/

import java.util.*;

public class d26p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(), p = sc.next();
        System.out.println(findAnagrams(s, p));
        sc.close();
    }

    static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < s.length() - p.length() + 1; i++) {
            if (isAnagram(s.substring(i, i + p.length()), p)) {
                ans.add(i);
            }
        }
        return ans;
    }

    static boolean isAnagram(String s, String p) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[p.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
