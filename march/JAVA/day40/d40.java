// You are given a binary array nums containing only the integers 0 and 1. 
// Return the number of subarrays in nums that have more 1's than 0's. 
// Since the answer may be very large, return it modulo 10^9 + 7.

// A subarray is a contiguous sequence of elements within an array.

//  Example 1:

// Input: nums = [0,1,1,0,1]
// Output: 9
// Explanation:
// The subarrays of size 1 that have more ones than zeros are: [1], [1], [1]
// The subarrays of size 2 that have more ones than zeros are: [1,1]
// The subarrays of size 3 that have more ones than zeros are: [0,1,1], [1,1,0], [1,0,1]
// The subarrays of size 4 that have more ones than zeros are: [1,1,0,1]
// The subarrays of size 5 that have more ones than zeros are: [0,1,1,0,1]
// Example 2:

// Input: nums = [0]
// Output: 0
// Explanation:
// No subarrays have more ones than zeros.
// Example 3:

// Input: nums = [1]
// Output: 1
// Explanation:
// The subarrays of size 1 that have more ones than zeros are: [1]


// Constraints:

// 1 <= nums.length <= 105
// 0 <= nums[i] <= 1

import java.util.*;

public class d40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        System.out.println(findSum(arr));
        sc.close();
    }

    static int findSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += findSubArrayCount(arr, i + 1);
        }
        return sum;
    }

    static int findSubArrayCount(int[] arr, int k) {
        // find subarray fo size k with more 1's than 0's
        int count = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        if (sum > k / 2)
            count++;
        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];
            if (sum > k / 2)
                count++;
        }
        return count;
    }
}
