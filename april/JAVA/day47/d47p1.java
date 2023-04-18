/*

You are given a binary array nums containing only the integers 0 and 1. 

Return the number of subarrays in nums that have more 1's than 0's. 

Since the answer may be very large, return it modulo 10^9 + 7.

A subarray is a contiguous sequence of elements within an array.

Example 1:

Input: nums = [0,1,1,0,1]
Output: 9

Explanation:
The subarrays of size 1 that have more ones than zeros are: [1], [1], [1]
The subarrays of size 2 that have more ones than zeros are: [1,1]
The subarrays of size 3 that have more ones than zeros are: [0,1,1], [1,1,0], [1,0,1]
The subarrays of size 4 that have more ones than zeros are: [1,1,0,1]
The subarrays of size 5 that have more ones than zeros are: [0,1,1,0,1]

Example 2:

Input: nums = [0]
Output: 0
Explanation:
No subarrays have more ones than zeros.
Example 3:

Input: nums = [1]
Output: 1
Explanation:
The subarrays of size 1 that have more ones than zeros are: [1]


Constraints:

1 <= nums.length <= 105
0 <= nums[i] <= 1

*/

import java.util.*;

public class d47p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(findSubarrays(arr));
        sc.close();
    }

    static int findSubarrays(int[] arr) {
        List<int[]> subarrays = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                StringBuilder res = new StringBuilder();
                for (int k = i; k <= j; k++)
                    res.append(arr[k]);
                int[] subarray = new int[res.toString().length()];
                for (int k = 0; k < res.length(); k++)
                    subarray[k] = Integer.parseInt(res.charAt(k) + "");
                subarrays.add(subarray);
            }
        }
        int count = 0;
        for (int[] subarray : subarrays) {
            int ones = 0;
            int zeroes = 0;
            for (int i : subarray) {
                ones += i;
            }
            zeroes = subarray.length - ones;
            if (ones > zeroes)
                count++;
        }
        return count;
    }
}
