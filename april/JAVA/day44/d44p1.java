/*

Viraj Aanand is a wedding planner, He ordered his assistant to decorate a wall.
The decorator plans to decorate the wall with two different colored balloons.
The wall size is M*N, The decorator can decorate the wall using M*N balloons
the balloons are blue or white in color.

Blue colored ballons represented with digit-1 and 
White colored ballons represented with digit-0.

The blue colored balloons forms different shapes, that are connected 4 directonally.
The directons are upwards, downwards, left, and right. Viraj Aanand got an idea to 
count the unique shapes formed by blue colored ballons.

You will be given the decorated wall as a matrix wall[][].
Your task is to help, Viraj Aanand to count the unique shapes.

Input Format:
-------------
Line-1: Two space separated integers M and N, size of the wall.
Next M lines: N space separated integers, either 0 or 1.

Output Format:
--------------
Print an integer, Number of distinct shapes formed by blue balloons.


Sample Input-1:
---------------
4 5
1 1 0 0 0
1 1 0 0 0
0 0 0 1 1
0 0 0 1 1

Sample Output-1:
----------------
1


Sample Input-2:
---------------
5 5
1 1 0 1 1
1 0 0 0 1
0 0 0 0 0
1 0 0 0 1
1 1 0 1 1

Sample Output-2:
----------------
4

*/

import java.util.*;

public class d44p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] wall = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                wall[i][j] = sc.nextInt();
            }
        }
        System.out.println(countShapes(wall));
        sc.close();
    }

    static int countShapes(int[][] wall) {
        int m = wall.length;
        int n = wall[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (wall[i][j] == 1) {
                    dfs(wall, i, j);
                }
            }
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (wall[i][j] == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    static void dfs(int[][] wall, int i, int j) {
        int m = wall.length;
        int n = wall[0].length;
        if (i < 0 || i >= m || j < 0 || j >= n || wall[i][j] == 0) {
            return;
        }
        wall[i][j] = 0;
        dfs(wall, i + 1, j);
        dfs(wall, i - 1, j);
        dfs(wall, i, j + 1);
        dfs(wall, i, j - 1);
    }
}
