/*
Somu is playing a game. The Game Rules are as follows 

A word will be given, where Ramu has to replace the letters of the word with V/C
If the letter is a vowel it will be de denoted by upper case letter ‘V’ and 
if the letter is a consonant it will be denoted by upper case letter ‘C’. 

Note - The output will contain a word containing alternating sequence of ‘C’ and ‘V’.
It is not permissible to have two or more consecutive V or C in Sequence.
Letters will be only(a-z/A-Z)

input = hello 
output = CVCV

Explanation - When we convert the above  "hello" we have CVCCV 
but for the output It is not permissible to have two or more consecutive V or C in Sequence.
so CVCCV changes to CVCV
*/

import java.util.*;

public class d3p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solve(s));
        sc.close();
    }

    static String solve(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                sb.append('V');
            } else {
                sb.append('C');
            }
        }
        String res = sb.toString();
        while (res.contains("VV") || res.contains("CC")) {
            res = res.replace("VV", "V");
            res = res.replace("CC", "C");
        }
        return res;
    }

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U';
    }
}
