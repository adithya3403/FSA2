/*

Given an integer array of nums and an integer X, 
return true if there are no duplicate values in that Window(X)
X size is always == abs(i - j)    where i and j are two distinct indices of array.

Sample Input/output
------------------
input:
--------------
array size
array elements
X   
output:
-----------
true

Example 1:
Input: 4            
1 2 3 1  
3       
Output: true

case 2:
Input: 6
1 2 3 1 2 3
2
Output: true


*/

import java.util.*;

public class d16p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(hasDuplicates(arr, x));
        sc.close();
    }

    static boolean hasDuplicates(int[] arr, int x) {
        Set<Integer> set = new HashSet<>();
        int i = 0, j = 0;
        while (j < arr.length) {
            if (set.contains(arr[j]))
                return false;
            set.add(arr[j++]);
            if (j - i == x)
                set.remove(arr[i++]);
        }
        return true;
    }
}