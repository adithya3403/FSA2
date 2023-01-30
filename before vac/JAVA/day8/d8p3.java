/*

Given an matrix with no duplicate values, return all lucky numbers in the
matrix.

A lucky number is an element of the matrix such that, it is the maximum element in its row and minimum in its column.

ex:
input =
3 3
3 7 8
9 11 13
15 16 17
output =8
explanantion: 8 is the only lucky number since it is the maximum number in row and minimum in its column.


ex2:
input =
3
4
15 16 17 12
9 3 8 7
1 10 4 2
output =-1
none of the elements in the matrix matches the luckynumber rules. so print -1.

input =
2 2
1 2
7 8
output =2
explanantion: 2 is the only lucky number since it is the maximum number in row and minimum in its column.

*/

import java.util.*;

public class d8p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int flag = 0;
        for (int i = 0; i < n; i++) {
            int max = arr[i][0];
            int index = 0;
            for (int j = 0; j < m; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    index = j;
                }
            }
            int min = arr[0][index];
            for (int k = 0; k < n; k++) {
                if (arr[k][index] < min) {
                    min = arr[k][index];
                }
            }
            if (max == min) {
                System.out.println(max);
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println(-1);
        }
        sc.close();
    }
}