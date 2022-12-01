/*

Scott is a sweet lover and eats sweets daily. His father is worried about his health 
and gives a task to Scott. If Scott solves the task then he is allowed to eat the sweets.

His task is as follows

Scott is given a word 'W'. Now he is supposed to see, the word is a Balanced Word or Not .

A word is said to be Balanced word if it contains all characters same number of times. 
He can also make the word Balanced by removing  only one occurence of a character at any index in the word. 

If he is able to do so print "true" else print "false"


Sample Test Case-1

input = xyz
output = true

This is Balanced because (x-1,y-1,z-1)

Sample Test Case-2

input = xyzz
output = true

This is Balanced because (x-1,y-1,z-2)
He can remove one occurence of z, It results in (x-1,y-1,z-1)

Sample Test Case-3

input = xxyyzzzz
output = false

This is not Balanced because (x-2,y-2,z-4)
By removing once occurence of z, It results in (x-2,y-2,z-3)
So this is not Balanced

Sample Test Case-4

input = xzxyzxz
output = true

This is Balanced because (x-3,y-1,z-3)
By removing once occurence of y, It results in (x-3,z-3)
So this is  Balanced


*/

import java.util.*;

public class d4p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isBalanced(str));
        sc.close();
    }

    static boolean isBalanced(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                count++;
            }
        }
        int[] freq2 = new int[count];
        int k = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                freq2[k++] = freq[i];
            }
        }
        Arrays.sort(freq2);
        if (freq2[0] == freq2[count - 1]) {
            return true;
        } else if (freq2[0] == freq2[count - 2] && freq2[count - 1] - freq2[count - 2] == 1) {
            return true;
        } else if (freq2[1] == freq2[count - 1] && freq2[0] == 1) {
            return true;
        } else {
            return false;
        }
    }
}