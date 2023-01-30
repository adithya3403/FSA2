/*

write a java program to print the elements of
3-d matrix using enhanced for loop

input = 
2 3 4
1 2 3 4
5 6 7 8
9 8 7 6
1 8 7 6
4 3 2 1
9 8 7 6
output =
1 2 3 4
5 6 7 8
9 8 7 6
1 8 7 6
4 3 2 1
9 8 7 6

*/

import java.util.*;

public class d5p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[][][] arr = new int[a][b][c];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
        print(arr);
        sc.close();
    }

    static void print(int[][][] arr) {
        for (int[][] res1 : arr) {
            for (int[] res2 : res1) {
                for (int r : res2) {
                    System.out.print(r + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    }
}