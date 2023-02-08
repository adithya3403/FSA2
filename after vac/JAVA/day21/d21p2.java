/*

We define the following operations on a string 

Left Shift : A single circular rotation of the string in which the first character becomes the last character and all other characters are shited 
one index to the left. For example, abcde becomes bcdea after one left shift and cdeab after two left shifts

Right Shift : A single circular rotation of the string in which the last character becomes the first character and all other characters are shifted 
one index to the right. For example, abcde becomes eabcd after one right shift and deabc after two right shifts.

The Program should print the string s after performing the stated shifts.

The first line of input contains s, the string to shift.
The second line contains an integer leftShifts
The third line contains an integer, right Shifts


input = abcd
1
2
output = dabc 


Initially s is abcd, we perform 
1. leftShifts = 1 : abcd -> bcda 
2. rightShifts = 2 : bcda -> abcd -> dabc

The program should print dabc 

input = abcde
2
3
output = eabcd

Explanation -

abcde --> 2 Left Shift 
bcdea
cdeab

3 times Right Shift 
cdeab

bcdea
abcde
eabcd

*/

import java.util.*;

public class d21p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int l = sc.nextInt(), r = sc.nextInt();
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < l; i++) {
            char ch = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(ch);
        }
        for (int i = 0; i < r; i++) {
            char ch = sb.charAt(sb.length() - 1);
            sb.deleteCharAt(sb.length() - 1);
            sb.insert(0, ch);
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
