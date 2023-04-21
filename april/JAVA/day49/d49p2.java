/*

You are given a string s, which contains stars *.

In one operation, you can:

Choose a star in s.
Remove the closest non-star character to its left, as well as remove the star itself.
Return the string after all stars have been removed.

input= kes**hav**mem**orial
output= khmorial 

*/

import java.util.*;

public class d49p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(remove(s));
        sc.close();
    }
    static String remove(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                if (!st.isEmpty() && st.peek() != '*') st.pop();
            } else st.push(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) sb.append(st.pop());
        return sb.reverse().toString();
    }
}
