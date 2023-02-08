/*

There is a lotterry with n coupons and n people take part of it. Each person picks exactly one coupon. 
Coupons are numbered consecutively from 1 to n, and the coupon[i] has the number i written on it. 
The winner of the lottery is any person who owns a coupon with the sum of digits written on it equal to s. 

If there are multiple winners, the prize is split equally among them. Determine how many values of s there are 
where there is at least one winner and the prize is split among the most people.

For example, given the input n = 12, the list of ticket numbers is coupons = [1,2,3,4,5,6,7,8,9,10,11,12]. The sum of the digits are coupon_sums =
[1,2,3,4,5,6,7,8,9,1,2,3].  The largest number of winners is 2 which will occur for tickets numbered [1,10],[2,11] and [3,12]. The maximum 
number of possible winners occurs for any of 3 possible values of s, so 3 is the answer.

The program should print the number of ways to choose s, in such a way that there is at least one winner and the price is split among the highest number of people.

The input contains an integer n denoting the maximum ticket number. 



input = 3
output = 3

Explanation - THe three lottery coupons are numbered 1,2 and 3. The sum of the digits of the coupon numbers are 1,2 and 3 respectively. 
There are three ways to choose s:

When s=1, only the person with coupon number = 1 is the winner.
When s=2, only the person with coupon number = 2 is the winner.
When s=3, only the person with coupon number = 3 is the winner.

input = 11
output = 2

Explanation - The lottery coupons are numbered from 1 to 11 and the sum of the digits of each of them is 
1,2,3,4,5,6,7,8,9,1 and 2 respectively. 

There are two ways to choose s:

When s =1, there are two winners and their coupon numbers are 1 and 10.
When s=2, there are two winners and their coupon numbers are 2 and 11.

*/

import java.util.*;

public class d21p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
        sc.close();
    }

    static int sum(int n) {
        int sum=0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
