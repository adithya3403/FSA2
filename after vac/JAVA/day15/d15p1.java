/*

You are given an m x n integer matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.

Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.

Example 1:

input =3 4
1 3 5 7 
10 11 16 20 
23 30 34 60
3
Output: true



Example 2:

input =3 4
1 3 5 7 
10 11 16 20 
23 30 34 60
13
Output: false


Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 100
-104 <= matrix[i][j], target <= 104

*/

import java.util.*;

public class d15p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        System.out.println(find(arr, x));
        sc.close();
    }

    static boolean find(int[][] arr, int x) {
        int m = arr.length, n = arr[0].length;
        int l = 0, r = m * n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int i = mid / n, j = mid % n;
            if (arr[i][j] == x)
                return true;
            else if (arr[i][j] < x)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return false;
    }
}