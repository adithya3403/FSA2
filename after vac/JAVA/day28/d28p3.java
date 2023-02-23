/*

Grade: 75/100    ( Test case 4 failed )

Given an integer array nums and an integer k, return the k most frequent elements.
You may return the answer in any order.

Example 1:
input =6
1 1 1 2 2 3
2
output =1 2

explanation
nums = [1,1,1,2,2,3], k = 2
Output: [1,2]

Input: nums = [1], k = 1
Output: [1]
 

Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104
k is in the range [1, the number of unique elements in the array].
It is guaranteed that the answer is unique.

*/

import java.util.*;

public class d28p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr)
            map.put(i, map.getOrDefault(i, 0) + 1);
        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());
        for (int i = 0; i < k; i++)
            System.out.print(list.get(i).getKey() + " ");
        sc.close();
    }
}
