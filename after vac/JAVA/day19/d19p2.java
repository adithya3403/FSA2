/*

Given an array of characters chars, compress it using the following algorithm:
Begin with an empty string s. For each group of consecutive repeating characters in chars:

If the group's length is 1, append the character to s.
Otherwise, append the character followed by the group's length.
The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will
 be split into multiple characters in chars.

After you are done modifying the input array, return the new length of the array.

You must write an algorithm that uses only constant extra space.

 
input =7
a a b b b c c c
output =6

chars = ["a","a","b","b","c","c","c"]
Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".


input =1
a
output =1
the first character of the input array should be: ["a"]
Explanation: The only group is "a", which remains uncompressed since it's a single character.

input =13
a b b b b b b b b b b b b
output =4
the first 4 characters of the input array should be: ["a","b","1","2"].
Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".

*/

import java.util.*;

public class d19p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        System.out.println(findLen(arr));
        sc.close();
    }

    static int findLen(String[] arr) {
        int i = 0, j = 0, count = 0;
        while (i<arr.length) {
            int grouplen=1;
            while (i+grouplen<arr.length && arr[i].equals(arr[i+grouplen])) {
                grouplen++;
            }
            arr[j++] = arr[i];
            if (grouplen>1) {
                String len = grouplen+"";
                for (int k = 0; k < len.length(); k++) {
                    arr[j++] = len.charAt(k)+"";
                }
            }
            i+=grouplen;
            count+=grouplen;
        }
        return count;
    }
}
