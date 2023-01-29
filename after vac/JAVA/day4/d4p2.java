/*

write a java program to read the number in string format and print the second largest digit based on frequency.
print -1 for other bounday conditions.

example:
123412213
output =
3

explanation:
frequency of 1 is 3
frequency of 2 is 3
frequency of 3 is 2, so print 3

input = 
9797793333
output =
9
7
explanation:
frequency of 9 is 3
frequency of 7 is 3
frequency of 3 is 4, so print 9 and 7( in the order they occur insertion order)


input = 456
output = -1

here we dont have second frequency count so print -1

input = 11
output = -1

*/

import java.util.*;
public class d4p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int[] freq = new int[10];
        for (int i = 0; i < num.length(); i++) {
            freq[num.charAt(i) - '0']++;
        }
        int max1 = 0, max2 = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > freq[max1]) {
                max2 = max1;
                max1 = i;
            } else if (freq[i] > freq[max2] && freq[i] != freq[max1]) {
                max2 = i;
            }
        }
        if (freq[max2] == 0) {
            System.out.println(-1);
        } else {
            System.out.println(max2);
        }
        sc.close();
    }
}