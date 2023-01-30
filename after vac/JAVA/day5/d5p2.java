/*

Given a line s, reverse only all the vowels in the 
string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can 
appear in both lower and upper cases, more than once.

Example 1:
Input: hello
Output: holle


Example 2:
Input: Keshavmemorial
Output: Kashivmomerael

Example 3:
Input: variations
Output: voriatians

*/

import java.util.*;

public class d5p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverseVowels(str));
        sc.close();
    }

    static String reverseVowels(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            char a = str.charAt(i), b = str.charAt(j);
            if (isVowel(a) && isVowel(b)) {
                swap(str, i, j);
                i++;
                j--;
            } else if (isVowel(a))
                j--;
            else if (isVowel(b))
                i++;
            else {
                i++;
                j--;
            }
        }
        return str;
    }

    static boolean isVowel(char x) {
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < vowels.length(); i++) {
            if (vowels.charAt(i) == x) {
                return true;
            }
        }
        return false;
    }

    static String swap(String s, int i, int j) {
        char[] arr = s.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < arr.length; k++) {
            sb.append(arr[k]);
        }
        return sb.toString();
    }
}