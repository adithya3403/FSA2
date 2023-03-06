/*

Given two sorted arrays and a number x, find the pair whose sum is closest to x and the pair has an element from each array. 

We are given two arrays ar1[0…m-1] and ar2[0..n-1] and a number x, 

we need to find the pair ar1[i] + ar2[j] such that absolute value of (ar1[i] + ar2[j] – x) is minimum.

Example: 
input =4
1 4 5 7
4
10 20 30 40
32
output =1 30


input=4
1 4 5 7
4
10 20 30 40
50
output =7 40

*/

import java.util.*;

public class d34p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] a1 = new int[m];
        for (int i = 0; i < m; i++)
            a1[i] = sc.nextInt();
        int n = sc.nextInt();
        int[] a2 = new int[n];
        for (int i = 0; i < n; i++)
            a2[i] = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(findNums(a1, a2, x));
        sc.close();
    }

    static String findNums(int[] a1, int[] a2, int x) {
        int i = 0, j = a2.length - 1, a = 0, b = 0, min = Integer.MAX_VALUE;
        while (i < a1.length && j >= 0) {
            int sum = a1[i] + a2[j];
            if (Math.abs(sum - x) < min) {
                min = Math.abs(sum - x);
                a = a1[i];
                b = a2[j];
            }
            if (sum > x)
                j--;
            else
                i++;
        }
        return a + " " + b;
    }
}
