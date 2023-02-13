/*

Given a binary array data, return the minimum number of swaps required to
group all 1's present in the array together in any place in the array.

input =5
1 0 1 0 1
output =1
Explanation: There are 3 ways to group all 1's together:
[1,1,1,0,0] using 1 swap.
[0,1,1,1,0] using 2 swaps.
[0,0,1,1,1] using 1 swap.
The minimum is 1.


input =5
0 0 0 1 0
output =0
Explanation: Since there is only one 1 in the array, no swaps are needed.
Example 3:

input =11
1 0 1 0 1 0 0 1 1 0 1
output =3
Explanation: One possible solution that uses 3 swaps is [0,0,0,0,0,1,1,1,1,1,1].

*/

import java.util.*;

public class d23p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(findMinSwaps(arr));
        sc.close();
    }

    static int findMinSwaps(int[] arr) {
        int n = arr.length, count = 0, max = 0, k = 0;
        for (int i = 0; i < n; i++)
            if (arr[i] == 1)
                count++;
        for (int i = 0; i < count; i++)
            if (arr[i] == 1)
                k++;
        max = k;
        for (int i = 1; i < n - count + 1; i++) {
            if (arr[i - 1] == 1)
                k--;
            if (arr[i + count - 1] == 1)
                k++;
            max = Math.max(max, k);
        }
        return count - max;
    }
}
