/*

Given two Integer ArrayList, add their elements to a new ArrayList by satisfying following conditions 

1. Addition should be done starting from 0th index of both ArrayList.
2. Split the sum if it is a not a single digit number and store the digits in adjacent locations
3. Output ArrayList should accommodate any remaining digits of larger input ArrayList.
4.Assume the input contains only positive numbers

Examples:
First line contains the size of first ArrayList followed by first ArrayList elements followed by second ArrayList size followed by 
second ArrayList elements 

input =
6
9 2 3 7 9 6
8
3 1 4 7 8 7 6 9
output =
1 2 3 7 1 4 1 7 1 3 6 9

input = 
6
9343 2 3 7 9 6
8
34 11 4 7 8 7 6 99
output =
9 3 7 7 1 3 7 1 4 1 7 1 3 6 9 9

input = 
3
345 124 54
5
123 221 325 4234 5167
output = 
4 6 8 3 4 5 3 7 9 4 2 3 4 5 1 6 7

TEST CASES:

case = 1
input =
9
9 8 7 6 5 4 3 2 1
9
1 2 3 4 5 6 7 8 9
output = 
1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0


case = 2
input = 
5
1 2 3 4 5
5
5 4 3 2 1
output =
6 6 6 6 6


case = 3
input =
3
1 2 3
2
10 12
output =
1 1 1 4 3 

case = 4
input =
1
10
1
20
output =
3 0

case = 5
input = 
3
300 100 50
5
100 200 300 4000 5000
outptu = 4 0 0 3 0 0 3 5 0 4 0 0 0 5 0 0 0

case = 6
input = 
5
100 200 300 4000 5000
3
300 100 50
output = 4 0 0 3 0 0 3 5 0 4 0 0 0 5 0 0 0

*/

import java.util.*;

public class d8p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        List<Integer> a1 = new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            a1.add(sc.nextInt());
        }
        int n2 = sc.nextInt();
        List<Integer> a2 = new ArrayList<>();
        for (int i = 0; i < n2; i++) {
            a2.add(sc.nextInt());
        }
        List<Integer> a3 = new ArrayList<>();
        int i = 0, j = 0;
        while (i < n1 && j < n2) {
            int sum = a1.get(i) + a2.get(j);
            StringBuilder sb = new StringBuilder();
            sb.append(sum);
            for (int k = 0; k < sb.length(); k++) {
                a3.add(sb.charAt(k) - '0');
            }
            i++;
            j++;
        }
        while (i < n1) {
            StringBuilder sb = new StringBuilder();
            sb.append(a1.get(i));
            for (int k = 0; k < sb.length(); k++) {
                a3.add(sb.charAt(k) - '0');
            }
            i++;
        }
        while (j < n2) {
            StringBuilder sb = new StringBuilder();
            sb.append(a2.get(j));
            for (int k = 0; k < sb.length(); k++) {
                a3.add(sb.charAt(k) - '0');
            }
            j++;
        }
        System.out.println(a3);
        sc.close();
    }
}
