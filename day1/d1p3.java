/*

Mr. Bob is a Military Encoders. 
Mr. Bob writes a word as shown below and then merges them. 
Help Bob to write the code. 

Mr. Bob will be given a word 'w' and a number 'n' 

Sample Test Case - 1
input = 
ABCDE
2
output = ACEBD


This is How Bob writes the letters of the word 
A    C    E
   B    D

Now concatenate the two rows and ignore spaces in every row. We get ACEBD


Sample Test Case - 2
input = system
3
output = seytms

s         e
  y    t    m
     s

Now concatenate the 3 rows we get seytms

*/

import java.util.*;

public class d1p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int n = sc.nextInt();
        System.out.println(solve(word, n));
        sc.close();
    }

    static String solve(String word, int n) {
        if (n == 1)
            return word;
        char[][] arr = new char[n][word.length()];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < word.length(); j++) {
                arr[i][j] = '_';
            }
        }
        int r = 0, c = 0;
        boolean down = true;
        for (int i = 0; i < word.length(); i++) {
            arr[r][c] = word.charAt(i);
            if (r == n - 1)
                down = false;
            else if (r == 0)
                down = true;
            if (down) {
                r++;
                c++;
            } else {
                r--;
                c++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < word.length(); j++) {
                if (arr[i][j] != '_') {
                    sb.append(arr[i][j]);
                }
            }
        }
        return sb.toString();
    }
}