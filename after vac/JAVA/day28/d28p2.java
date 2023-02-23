/*

Given string num representing a non-negative integer num, and an integer k, 
return the smallest possible integer after removing k digits from num.

Example 1:
input =1432219
3
output =1219

num = "1432219", k = 3
Output: "1219"
Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.


Input: num = "10200", k = 1
Output: "200"
Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
Example 3:

Input: num = "10", k = 2
Output: "0"
Explanation: Remove all the digits from the number and it is left with nothing which is 0.

*/

import java.util.*;

public class d28p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int k = sc.nextInt();
        System.out.println(removeKdigits(num, k));
        sc.close();
    }

    static String removeKdigits(String num, int k) {
        if (num.length() == k)
            return "0";
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            while (!st.isEmpty() && st.peek() > num.charAt(i) && k > 0) {
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        while (k-- > 0)
            st.pop();
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty())
            sb.append(st.pop());
        sb.reverse();
        while (sb.length() > 1 && sb.charAt(0) == '0')
            sb.deleteCharAt(0);
        return sb.toString();
    }
}
