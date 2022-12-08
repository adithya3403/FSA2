/*

Kalpana a third class student is playing with numbers. 
She has given her brother the same set of numbers and asked him to find the 
next greatest nearest number which contains the same set of digits same number of times. 

If no such number exists print -1 

input = 121
output = 211

input = 653
output = -1


input = 456
output = 465

*/

import java.util.*;

public class d7p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(nextGreater(n));
        sc.close();
    }

    static String nextGreater(int n) {
        char[] number = (n + "").toCharArray();
        int i, j;
        for (i = number.length-1; i > 0; i--)
            if (number[i-1] < number[i])
                break;
        if (i == 0)
            return "-1";
        int x = number[i-1], smallest = i;
        for (j = i+1; j < number.length; j++)
            if (number[j] > x && number[j] <= number[smallest])
                smallest = j;
        char temp = number[i-1];
        number[i-1] = number[smallest];
        number[smallest] = temp;
        Arrays.sort(number, i, number.length);
        return new String(number);
    }
}