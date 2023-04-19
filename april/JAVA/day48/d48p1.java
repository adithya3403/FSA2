/*

Given a string s consisting of lowercase English letters, return the first letter to appear twice.

Note:

A letter a appears twice before another letter b if the second occurrence of a is before the second occurrence of b.
s will contain at least one letter that appears twice.

input = abacab
output= a
input = aaccbbdd
output = a

*/

import java.util.*;

public class d48p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(firstDuplicate(s));
        sc.close();
    }

    static char firstDuplicate(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                return c;
            } else {
                map.put(c, 1);
            }
        }
        return ' ';
    }
}
