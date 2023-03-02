package day32;
/*

Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:

answer.length == nums.length.
answer[i] = |leftSum[i] - rightSum[i]|.
Where:

leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
Return the array answer.


Example 1:
input =4
10 4 8 3
output =15 1 11 22
Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].

input =1
1
output =0

Explanation: The array leftSum is [0] and the array rightSum is [0].
The array answer is [|0 - 0|] = [0].

*/

import java.util.*;

public class d32p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(solve(arr));
        sc.close();
    }

    static List<Integer> solve(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int[] leftSum = new int[arr.length];
        int[] rightSum = new int[arr.length];
        for (int i = 1; i < arr.length; i++)
            leftSum[i] = leftSum[i - 1] + arr[i - 1];
        for (int i = arr.length - 2; i >= 0; i--)
            rightSum[i] = rightSum[i + 1] + arr[i + 1];
        for (int i = 0; i < arr.length; i++)
            ans.add(Math.abs(leftSum[i] - rightSum[i]));
        return ans;
    }
}