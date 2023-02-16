/*

Mr.Sathya is playing with numbers he converts the decimal to binary and 
try to find number of positions at which the corresponding bits are different. 
Help sathya by giving solution to the problem to find sum of bits 
differences between all the pairs of the integers in given numbers.

input
Number of integers and List of integers
output
Return the sum of bit differences between all the pairs of the integers.
 
Example 1:

input=
3
4 14 2
output =4 14
4 2
14 2
6

Explanation: In binary representation, the 4 is 0100, 14 is 1110, and 2 is 0010 (just
showing the four bits relevant in this case).
The answer will be:
Distance(4, 14) + Distance(4, 2) + Distance(14, 2) = 2 + 2 + 2 = 6.


Example 2:
Input: 
3
4 14 4
Output: 4 14
4 4
14 4
4

*/

import java.util.*;

public class d24p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        findDist(arr);
        sc.close();
    }

    static void findDist(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                List<Integer> l = new ArrayList<>();
                l.add(arr[i]);
                l.add(arr[j]);
                list.add(l);
            }
        }
        int sum = 0;
        for (List<Integer> l : list) {
            int a = l.get(0), b = l.get(1);
            System.out.println(a + " " + b);
            int c = a ^ b, count = 0;
            for (; c > 0; c >>= 1) count += c & 1;
            sum += count;
        }
        System.out.println(sum);
    }
}
