/*

Given a number P which is of integer type. Print the resultant array result[] 
of size P+1, such that for each index I ( 0 <= I <= P), result[I] is the number 
of 1's in the binary represenation of I.

Input Format
-------------
Read an integer P.

Output Format
--------------
Number of 1's in the binary form of each index in the resultant array result[].


Sample input-1:
---------------
6

Sample output-1:
----------------
0 1 1 2 1 2 2

Explanation:
------------
Binary form of 0 is 0
Binary form of 1 is 1
Binary form of 2 is 10
Binary form of 3 is 11
Binary form of 4 is 100
Binary form of 5 is 101
Binary form of 6 is 110


Sample input-2:
---------------
3

Sample output-2:
----------------
0 1 1 2

Explanation:
------------
Binary form of 0 is 0
Binary form of 1 is 1
Binary form of 2 is 10
Binary form of 3 is 11

*/

import java.util.*;

public class d13p1 {
    // public static void main (String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     for (int i=0; i<=n; i++) System.out.print(Integer.bitCount(i)+" ");
    //     sc.close();
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findOnes(n));
        sc.close();
    }

    static List<Integer> findOnes(int n) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            String inBin = Integer.toBinaryString(i);
            int c = 0;
            for (int j = 0; j < inBin.length(); j++) {
                if (inBin.charAt(j) == '1') {
                    c++;
                }
            }
            ans.add(c);
        }
        return ans;
    }
}