// Grade: 80/100
// Test case 3 failed

/*
Given an list of words you should print all the characters that show up in all strings within the list (including duplicates).  

suppose character occurs 3 times in all words but not 4 times, you need to include that character three times in output

Assume the input will contains all lower case alphabets (a-z)

Print the output in alphabetic order with space separated
If you dont match any characters print -1


input =baba bbaa baaabb
output = a a b b
*/

import java.util.*;

public class d3p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");
        System.out.println(findCommon(words));
        sc.close();
    }

    static String findCommon(String[] words) {
        int min = words[0].length();
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < min) {
                min = words[i].length();
            }
        }
        String common = "";
        for (int i = 0; i < min; i++) {
            char c = words[0].charAt(i);
            boolean flag = true;
            for (int j = 1; j < words.length; j++) {
                if (words[j].indexOf(c) == -1) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                common += c;
            }
        }
        if (common.length() == 0) {
            return "-1";
        }
        char[] arr = common.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}