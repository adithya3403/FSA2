/*

You are given an integer array nums and two integers minK and maxK.

A fixed-bound subarray of nums is a subarray that satisfies the following conditions:

The minimum value in the subarray is equal to minK.
The maximum value in the subarray is equal to maxK.
Return the number of fixed-bound subarrays.

A subarray is a contiguous part of an array.

input = 4
1 1 1 1 
1 1
output = 10


Example 1:

Input: nums = [1,3,5,2,7,5], minK = 1, maxK = 5
Output: 2

Explanation: The fixed-bound subarrays are [1,3,5] and [1,3,5,2].
Example 2:

Input: nums = [1,1,1,1], minK = 1, maxK = 1
Output: 10

Explanation: Every subarray of nums is a fixed-bound subarray. There are 10 possible subarrays.
[1],[1],[1],[1],[1,1],[1,1],[1,1],[1,1,1],[1,1,1],[1,1,1,1]

Constraints:
2 <= nums.length <= 10^5
1 <= nums[i], minK, maxK <= 10^6

*/

import java.util.*;
public class d35p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int minK = sc.nextInt();
        int maxK = sc.nextInt();
        int count = 0;
        for(int i = 0; i < n; i++) {
            int min = arr[i];
            int max = arr[i];
            for(int j = i; j < n; j++) {
                min = Math.min(min, arr[j]);
                max = Math.max(max, arr[j]);
                if(min == minK && max == maxK) {
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}