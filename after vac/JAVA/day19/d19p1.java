/*

You are given an array of integers nums, there is a sliding window of size k
which is moving from the very left of the array to the very right. 
You can only see the k numbers in the window. Each time the sliding window moves right by one position.

Return the max sliding window.

Example 1:
input =8
1 3 -1 -3 5 3 6 7
3
output =3 3 5 5 6 7


Explanation: 
Window position                   Max
------------------------          -----
[1  3  -1] -3  5  3  6  7           3
1 [3  -1  -3] 5  3  6  7            3
1  3 [-1  -3  5] 3  6  7      	    5
1  3  -1 [-3  5  3] 6  7            5
1  3  -1  -3 [5  3  6] 7            6
1  3  -1  -3  5 [3  6  7]           7


input =1
1
1
output =1


nums = [1], k = 1
output =1


input =9
1 2 3 1 4 5 2 3 6
3
output =3 3 4 5 5 5 6

a[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}, k = 3 
Output: 3 3 4 5 5 5 6
Explanation: 
Maximum of subarray {1, 2, 3} is 3
Maximum of subarray {2, 3, 1} is 3
Maximum of subarray {3, 1, 4} is 4
Maximum of subarray {1, 4, 5} is 5
Maximum of subarray {4, 5, 2} is 5
Maximum of subarray {5, 2, 3} is 5
Maximum of subarray {2, 3, 6} is 6

*/

import java.util.*;

public class d19p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(findMax(arr, k));
        sc.close();
    }

    static List<Integer> findMax(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < k; i++)
            pq.add(arr[i]);
        ans.add(pq.peek());
        for (int i = k; i < arr.length; i++) {
            pq.remove(arr[i - k]);
            pq.add(arr[i]);
            ans.add(pq.peek());
        }
        return ans;
    }
}
