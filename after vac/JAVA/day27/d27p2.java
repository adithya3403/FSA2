/*

You are given a positive integer num. You may swap any two digits of num that have the same parity 
(i.e. both odd digits or both even digits).
Return the largest possible value of num after any number of swaps.


Example 1:

Input: num = 1234
Output: 3412
Explanation: Swap the digit 3 with the digit 1, this results in the number 3214.
Swap the digit 2 with the digit 4, this results in the number 3412.
Note that there may be other sequences of swaps but it can be shown that 3412 is the largest possible number.
Also note that we may not swap the digit 4 with the digit 1 since they are of different parities.
Example 2:

Input: num = 65875
Output: 87655
Explanation: Swap the digit 8 with the digit 6, this results in the number 85675.
Swap the first digit 5 with the digit 7, this results in the number 87655.
Note that there may be other sequences of swaps but it can be shown that 87655 is the largest possible number.

*/

import java.util.*;

public class d27p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(maximumSwap(num));
        sc.close();
    }

    static String maximumSwap(int num) {
        PriorityQueue<Integer> even = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> odd = new PriorityQueue<>(Collections.reverseOrder());
        String s = Integer.toString(num);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) % 2 == 0) even.add(s.charAt(i) - '0');
            else odd.add(s.charAt(i) - '0');
        }
        String ans = "";
        for (int i = 0; i < s.length(); i++)
            ans += (s.charAt(i) % 2 == 0) ? even.poll() : odd.poll();
        return ans;
    }
}
