/*
Raju a school student has given a group of numbers by his teacher.
Where the student has to arrange the numbers ofthe group by the following rule

Rules 
1) All '0' should be at the end of the group 
2) All +ive numbers should be at the begining of the group

He has to take a special care,i.e. he has to maintain the order of the numbers in the group.


Sample test case-1

input = 1 0 2 3 0 4 0 1
output = 1 2 3 4 1 0 0 0

Sample test case -2
input = 1 2 0 1 0 4 0
output = 1 2 1 4 0 0 0

He doesnt know how many numbers are there in group

Constraints

Time complexity: O(n)
Space complexity: O(1)

*/

import java.util.*;

public class d37p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i < arr.length; i++)
            arr[i] = Integer.parseInt(str[i]);
        modify(arr);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    static void modify(int[] arr) {
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}
