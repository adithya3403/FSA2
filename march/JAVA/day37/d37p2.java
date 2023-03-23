/*

Vinayak is given a number which is represented as  group of IndividualNumbers(IN).
The IN are ordered from Most significant to Least Significant in Left to Right Order.
The large IN does not contain any leading 0's.

Increment the given number by 1 and return the resulting group of IndividualNumbers.


input = 1 2 3
output = 1 2 4

Explanation - The group represents the number as 123
adding 1 will give you 123+1 = 124

input = 4 3 2 1
output = 4 3 2 2

*/

import java.util.*;

public class d37p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = Integer.parseInt(arr[i]);
        }
        int[] arr2 = increment(arr1);
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        sc.close();
    }

    public static int[] increment(int[] arr) {
        int[] arr2 = new int[arr.length];
        int carry = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int sum = arr[i] + carry;
            arr2[i] = sum % 10;
            carry = sum / 10;
        }
        if (carry == 0)
            return arr2;
        int[] arr3 = new int[arr.length + 1];
        arr3[0] = carry;
        for (int i = 1; i < arr3.length; i++) {
            arr3[i] = arr2[i - 1];
        }
        return arr3;
    }
}
