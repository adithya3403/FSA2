/*

Tinku a Small Kid is playing with the Amazon Fire TV Stick Remote
Tinku is not familar with the alphabets. 
He father gives him few alphabets and asks Tinku to type it. 
Tinku uses only one finger. 
At the Beginining, he will put his finger at the the 1st key, k[0];
To type the Next Alphabet he has to move his finger from that key(m) 
to that particular alphabet(n) he takes |m-n| seconds. 

Help Tinkus Father to see how much seconds does Tinku take to type the given alphabets.


input=poiuytrewqasdfghjklmnbvcxz
kmit
output=39


input=abcdefghijklmnopqrstuvwxyz
code
output=26

*/

import java.util.*;

public class d8p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String k = sc.next();
        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[s.charAt(i) - 'a'] = i;
        }
        int count = 0;
        for (int i = 0; i < k.length(); i++) {
            if (i == 0) {
                count += arr[k.charAt(i) - 'a'];
            } else {
                count += Math.abs(arr[k.charAt(i) - 'a'] - arr[k.charAt(i - 1) - 'a']);
            }
        }
        System.out.println(count);
        sc.close();
    }
}