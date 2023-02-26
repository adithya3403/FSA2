/*
Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.

The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.

Return the quotient after dividing dividend by divisor.

Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231, 231 − 1]. For this problem, if the quotient is strictly greater than 231 - 1, then return 231 - 1, and if the quotient is strictly less than -231, then return -231. Use Bit Manipulation

Example 1:

Input: dividend = 10, divisor = 3
Output: 3
Explanation: 10/3 = 3.33333.. which is truncated to 3.

Example 2:

Input: dividend = 7, divisor = -3
Output: -2
Explanation: 7/-3 = -2.33333.. which is truncated to -2.


Constraints:

-231 <= dividend, divisor <= 231 - 1
divisor != 0

*/

import java.util.*;
public class d29p1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int dividend = scn.nextInt();
        int divisor = scn.nextInt();
        System.out.println(divide(dividend, divisor));
        scn.close();
    }
    static int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
        long dvd = Math.abs((long)dividend);
        long dvs = Math.abs((long)divisor);
        int res = 0;
        while(dvd >= dvs){
            long temp = dvs, m = 1;
            while(dvd >= (temp << 1)){
                temp <<= 1;
                m <<= 1;
            }
            dvd -= temp;
            res += m;
        }
        return sign == 1 ? res : -res;
    }
}