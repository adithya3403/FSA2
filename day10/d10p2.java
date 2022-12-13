/*

You are starving and you want to eat food as quickly as possible. 
You want to find the shortest path to arrive at any food cell.
You are given an m x n character matrix, grid , of these different types of cells:
'*' is your location. There is exactly one '*' cell.
'#' is a food cell. There may be multiple food cells.
'O' is free space, and you can travel through these cells.
'X' is an obstacle, and you cannot travel through these cells.
You can travel to any adjacent cell north, east, south, or west of your current location if there is not an obstacle.
Return the length of the shortest path for you to reach any food cell. If there is no path for you to reach food, return -1 .



Input: grid = 4 6
[["X","X","X","X","X","X"],
 ["X","*","O","O","O","X"],
 ["X","O","O","#","O","X"],
 ["X","X","X","X","X","X"]]
Output: 3
Explanation: It takes 3 steps to reach the food.



Input: grid =4 5
   [["X","X","X","X","X"],
    ["X","*","X","O","X"],
    ["X","O","X","#","X"],
    ["X","X","X","X","X"]]
Output: -1
Explanation: It is not possible to reach the food.



Input: grid = [["X","X","X","X","X","X","X","X"],
            ["X","*","O","X","O","#","O","X"],
            ["X","O","O","X","O","O","X","X"],
            ["X","O","O","O","O","#","O","X"],
            ["X","X","X","X","X","X","X","X"]]
Output: 6
Explanation: There can be multiple food cells. It only takes 6 steps to reach the bottom food.


*/

import java.util.*;

public class d10p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        char[][] grid = new char[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }
        System.out.println(shortestPath(grid));
        sc.close();
    }

    static int shortestPath(char[][] grid) {
        int m = grid.length, n = grid[0].length, c = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '*') {
                    c = dfs(grid, i, j);
                    break;
                }
            }
        }
        return c;
    }

    static int dfs(char[][] grid, int i, int j) {
        int m = grid.length, n = grid[0].length;
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 'X')
            return -1;
        if (grid[i][j] == '#')
            return 0;
        grid[i][j] = 'X';
        int[] dx = { 0, 0, 1, -1 };
        int[] dy = { 1, -1, 0, 0 };
        int min = Integer.MAX_VALUE;
        for (int k = 0; k < 4; k++) {
            int x = i + dx[k];
            int y = j + dy[k];
            int d = dfs(grid, x, y);
            if (d != -1)
                min = Math.min(min, d);
        }
        grid[i][j] = 'O';
        return min == Integer.MAX_VALUE ? -1 : min + 1;
    }
}