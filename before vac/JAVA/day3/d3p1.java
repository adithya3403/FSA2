/*

Gene and Minne are playing with the words. Minne is always sure that his word
will be equal to the Genes word, after moving few letters of the Genes word to the end.
Help Minne to solve the problem.

The first line of input contains the Genes word followed by Minne word. 
If it matches print true else print false


Sample Test Case - 1
input = abcde 
eabcd
output = true 


After performing the Genes word abcde-bcdea-cdeab-deabc-eabcd.


Sample Test Case - 2
input = abcdef
fedcba
output = false

Explanation -
After performing the Genes word  abcdef bcdefa cdefab defabc efabcd fabcde 
which doesnt match with the Minne word so the output is false

*/

import java.util.*;

public class d3p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(isMatching(s1, s2));
        sc.close();
    }

    static boolean isMatching(String a, String b) {
        if (a.length() != b.length())
            return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.equals(b))
                return true;
            a = a.substring(1) + a.charAt(0);
        }
        return false;
    }
}
