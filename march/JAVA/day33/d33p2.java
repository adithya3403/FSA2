/*

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

input =3
flower flow flight
output =fl

input =3
dog racecar car
output =none

Explanation: There is no common prefix among the input strings.


Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.

*/

import java.util.*;

public class d33p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.next();
        String res = findLCP(arr, 0, arr.length - 1);
        if (res.length() == 0)
            System.out.println("none");
        else
            System.out.println(res);
        sc.close();
    }

    static String findLCP(String[] arr, int l, int r) {
        if (l == r)
            return arr[l];
        int mid = (r + l) / 2;
        String left = findLCP(arr, l, mid);
        String right = findLCP(arr, mid + 1, r);
        return lcp(left, right);
    }

    static String lcp(String a, String b) {
        int min = Math.min(a.length(), b.length());
        for (int i = 0; i < min; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return a.substring(0, i);
            }
        }
        return a.substring(0, min);
    }
}
