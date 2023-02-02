/*

Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.


Example 1:
case = 1
input =5
-4 -1 0 3 10
output =0 1 9 16 100


nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].

Example 2:
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.
 

*/

import java.util.*;
public class d18p2 {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0; i<n; i++) arr[i]=sc.nextInt();
        int[] ans=findSquares(arr);
        for (int i=0; i<n; i++) System.out.print(ans[i]+" ");
        sc.close();
    }
    static int[] findSquares(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int i=0, j=n-1, k=n-1;
        while (i<=j) {
            if (Math.abs(nums[i])>Math.abs(nums[j])) {
                ans[k]=nums[i]*nums[i];
                i++;
            } else {
                ans[k]=nums[j]*nums[j];
                j--;
            }
            k--;
        }
        return ans;
    }
}