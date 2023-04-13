/*

IPL Has decided to have cricket Matches during this summer.
They are planning to have N matches. Each Match starts and ends in a particular time slot. 

You are given an array of time slots of the N matches, consisting of
begin and end times (b1,e1),(b2,e2),... (b < e ).
Your task is to determine minimum number of cricket stadiums required 
to conduct all the matches smoothly.

NOTE: If a match begins at time 'a' ends at time 'b', 
another match can start at 'b'.

The first line of input consists of N number of matches followed by a 'N' pairs,
where each pair indicates the begin and end time of each game. 


Print an integer, minimum number of stadiums required.


Sample Input-1:
---------------
3
0 30
5 10
15 20

Sample Output-1:
----------------
2

Sample Input-2:
---------------
3
0 10
15 25
25 35

Sample Output-2:
----------------
1

case =1
input =10
1 10
15 25
30 40
45 60
11 15
61 70
41 50
75 90
80 95
91 100
output =2

case =2
input =10
1 15
20 35
30 45
35 50
25 40
10 25
60 75
45 60
40 55
50 65
output =3

case =3
input =15
1 25
10 20
10 35
15 30
25 40
30 50
25 50
40 75
35 60
20 40
40 60
35 50
20 45
25 60
50 75
output =8

case =4
input =20
1 25
10 20
10 35
15 30
45 60
25 40
35 55
25 50
50 90
55 75
50 80
40 75
35 60
20 40
40 60
70 90
35 50
20 45
25 60
50 75
output =9

case =5
input =10
10 40
40 70
50 80
70 100
100 130
130 150
65 95
55 85
45 75
35 65
output =5

case =6
input =15
1 15
20 35
30 45
35 50
25 40
10 25
60 75
45 60
40 55
50 65
15 35
35 60
30 50
45 70
60 90
output =6

*/

import java.util.*;

public class d46p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        System.out.println(minStadiums(arr));
        sc.close();
    }

    static int minStadiums(int[][] arr) {
        int n = arr.length;
        int[] start = new int[n];
        int[] end = new int[n];
        for (int i = 0; i < n; i++) {
            start[i] = arr[i][0];
            end[i] = arr[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int i = 0, j = 0, count = 0, max = 0;
        while (i < n && j < n) {
            if (start[i] < end[j]) {
                count++;
                i++;
            } else {
                count--;
                j++;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
