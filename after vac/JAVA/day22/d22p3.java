/*

Given a non-empty string s and an abbreviation abbr, 
return whether the string matches with the given abbreviation.
A string such as "word" contains only the following valid abbreviations:
["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", 
"1or1", "w1r1", "1o2", "2r1", "3d", "w3", "4"]


Notice that only the above abbreviations are valid abbreviations of 
the string "word".
Any other string is not a valid abbreviation of "word".

Note: Assume s contains only lowercase letters and abbr contains only 
lowercase letters and digits.

Example 1:
Given s = "internationalization", abbr = "i12iz4n":


Return true.


Example 2:
Given s = "apple", abbr = "a2e":
Return false.

*/

import java.util.*;

public class d22p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String abbr = sc.next();
        System.out.println(areSame(s, abbr));
        sc.close();
    }

    static boolean areSame(String s, String abbr) {
        int len = 0;
        for (int i = 0; i < abbr.length(); i++) {
            if (Character.isLetter(abbr.charAt(i)))
                len++;
            else {
                int j = i;
                while (j < abbr.length() && Character.isDigit(abbr.charAt(j)))
                    j++;
                len += Integer.parseInt(abbr.substring(i, j));
                i = j - 1;
            }
        }
        return len == s.length();
    }
}
