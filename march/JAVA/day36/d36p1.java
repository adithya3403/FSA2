// grade: 50/100

/*

There are some cubes, each cube is printed with an alphabet [A-Z].
Using these cubes, you can create non-empty distinct words.
and length of the words should be 0< length <= no.of.cubes.

You are given a string of alphabets S, 
Your task is to findout number of possible non-empty distinct words

Input Format:
-------------
A string S, consist of A-Z letters only.

Output Format:
--------------
Print an integer, number of possible non-empty distinct words.


Sample Input-1:
---------------
EGG

Sample Output-1:
----------------
8

Explanation:
--------------
The possible distinct words are "E", "G", "EG", "GG", "GE", "EGG", "GEG", "GGE".


Sample Input-2:
---------------
MADAM

Sample Output-2:
----------------
89

*/

import java.util.*;
public class d36p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) != s.charAt(j)) {
                    dp[i] += dp[j];
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += dp[i];
        }
        System.out.println(ans);
        sc.close();
    }
}