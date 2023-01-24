/*

An encoded string S is given.  To find and write the decoded string to a tape, the encoded string is read one character at a time and the following steps are taken:

If the character read is a letter, that letter is written onto the tape.
If the character read is a digit (say d), the entire current tape is repeatedly written d-1 more times in total.
Now for some encoded string S, and an index K, find and return the K-th letter (1 indexed) in the decoded string.

 

input =leet2code3
10
output =o


Explanation:
Input: S = "leet2code3", 
K = 10
Output: "o"
 The decoded string is "leetleetcodeleetleetcodeleetleetcode".
The 10th letter in the string is "o".


Example 2:
input =ha22
5
output =h

Explanation
Input: S = "ha22", K = 5
Output: "h"

The decoded string is "hahahaha".  The 5th letter is "h".
Example 3:


input =a2345678999999999999999
1
output =a

Explanation
Input: S = "a2345678999999999999999", K = 1
Output: "a"
Explanation: 
The decoded string is "a" repeated 8301530446056247680 times.  The 1st letter is "a".
 

*/

import java.util.*;

public class d1p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        System.out.println(decoded(s, k));
        sc.close();
    }

    static String decoded(String s, int k) {
        StringBuilder sb = new StringBuilder();
        if (k == 1) {
            sb.append(s.charAt(0));
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i))) {
                    int n = s.charAt(i) - '0';
                    String temp = sb.toString();
                    for (int j = 0; j < n - 1; j++) {
                        sb.append(temp);
                    }
                } else {
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString().substring(k - 1, k);
    }
}