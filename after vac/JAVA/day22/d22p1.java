/*

Cardano is a famous mathematician working with numbers. He is given a number N. 

Your task is to help Mr Cardano to find smallest number S, 
where the product of all the digits of S should be equal to N.
If it is not possible to create S with in range of integer, print 0.


Input Format:
-------------
An integer N

Output Format:
--------------
Print an integer, smallest number S.


Sample Input-1:
---------------
36

Sample Output-1:
----------------
49

Explnation:
-----------
36 = 2*2*3*3, some of the valid numbers with the digit factors are: 
2233,3223,3232,3322, 433, 343, 334, 263, 362, 94, 66, 49.
So, the least number posible is 49.


Sample Input-2:
---------------
147

Sample Output-2:
----------------
377

Explnation:
-----------
147 = 3*7*7, the valid numbers with the digit factors are: 377, 737, 773 
So, the least number is 377.


Sample Input-3:
---------------
22

Sample Output-3:
----------------
0

Explnation:
-----------
22 = 11*2, the valid numbers with the factors are: 112 
but the product of 1*1*2 is 2, not 22.
There is no possible valid number, So, return 0.

*/

import java.util.*;
public class d22p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findSmallest(n));
        sc.close();
    }
    static int findSmallest(int n) {
        int[] arr = new int[10];
        for (int i = 9; i > 1; i--) {
            while (n % i == 0) {
                arr[i]++;
                n /= i;
            }
        }
        if (n > 1) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i < 10; i++) {
            while (arr[i]-- > 0) {
                sb.append(i);
            }
        }
        return Integer.parseInt(sb.toString());
    }
}
