/*

Amazon fire tv stick keyboard wanted to be operated on number pad. 
You will be given the below pad. 
You are supposed to print all possible words in alphabetic order for a given number (0-9)

	1		2		3
		   abc	   def
		 
	4		5		6
   ghi             jkl     mno
  
	7		8		9
  pqrs           tuv    wxyz
	
	*		0		#


You will be given a string S which contains (2-9)  only  
For example: S = "3", then the possible words are "d", "e", "f".

Input Format:
-------------
String(2-9)

Output Format:
--------------
Print the list of words in alphabetical order


Sample Input-1:
---------------
2

Sample Output-1:
----------------
a b c


Sample Input-2:
---------------
24

Sample Output-2:
----------------
ag ah ai bg bh bi cg ch ci

*/

import java.util.*;

public class d7p1 {
    static Map<Character, String> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        System.out.println(combinations(s));
        sc.close();
    }

    static List<String> ans = new ArrayList<>();

    static List<String> combinations(String digits) {
        if (digits == null)
            return ans;
        backtrack(digits, 0, new StringBuilder());
        return ans;
    }

    static void backtrack(String digits, int index, StringBuilder sb) {
        if (index == digits.length()) {
            ans.add(sb.toString());
            return;
        }
        String letters = map.get(digits.charAt(index));
        for (int i = 0; i < letters.length(); i++) {
            sb.append(letters.charAt(i));
            backtrack(digits, index + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}