/*

You are given an integer array nums and two integers minK and maxK.

A fixed-bound subarray of nums is a subarray that satisfies the following conditions:

The minimum value in the subarray is equal to minK.
The maximum value in the subarray is equal to maxK.
Return the number of fixed-bound subarrays.

A subarray is a contiguous part of an array.
input = 4
1 1 1 1 
1
1
output = 10


Example 1:

Input: nums = [1,3,5,2,7,5], minK = 1, maxK = 5
Output: 2
Explanation: The fixed-bound subarrays are [1,3,5] and [1,3,5,2].
Example 2:

Input: nums = [1,1,1,1], minK = 1, maxK = 1
Output: 10
Explanation: Every subarray of nums is a fixed-bound subarray. There are 10 possible subarrays.

Constraints:
2 <= nums.length <= 10^5
1 <= nums[i], minK, maxK <= 10^6

*/

import java.util.*;

public class d48p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int min = sc.nextInt();
        int max = sc.nextInt();
        System.out.println(findSubarrays(arr, min, max));
        sc.close();
    }

    static int findSubarrays(int[] arr, int min, int max) {
        List<int[]> subarrays = findAllSubarrays(arr);
        int count = 0;
        for (int[] subarray : subarrays) {
            int minVal = Integer.MAX_VALUE;
            int maxVal = Integer.MIN_VALUE;
            for (int val : subarray) {
                minVal = Math.min(minVal, val);
                maxVal = Math.max(maxVal, val);
            }
            if (minVal == min && maxVal == max)
                count++;
        }
        return count;
    }

    static List<int[]> findAllSubarrays(int[] arr) {
        List<int[]> subarrays = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int[] subarray = new int[j - i + 1];
                for (int k = i; k <= j; k++)
                    subarray[k - i] = arr[k];
                subarrays.add(subarray);
            }
        }
        return subarrays;
    }
}
