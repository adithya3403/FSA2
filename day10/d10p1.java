/*

You are given an alphanumeric word W.
You need to find the number of words that can be formed from W.

The words have the following properties:
    - It should be a substring of W of any length, minimum 1.
    - All the letters in the word should be same.


Input Format:
-------------
Single String W.

Output Format:
--------------
Print an integer, the number of words can be formed


Sample Input-1:
---------------
paddy
 
Sample Output-1:
----------------
6

Explanation:
------------
The words are : p, a, d, d, dd, y


Sample Input-2:
---------------
abcde

Sample Output-2:
----------------
5

Explanation:
------------
The words are : a,b,c,d,e

*/

import java.util.*;
public class d10p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int count = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            int j = i+1;
            while(j<n && s.charAt(j)==ch) j++;
            count += (j-i)*(j-i+1)/2;
            i = j-1;
        }
        System.out.println(count);
        sc.close();
    }
}