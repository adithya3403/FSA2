/*

A Chef prepares a Balanced Diet with 'S' and 'M' amounts of Ingredients. 
Balanced Diet are those which have equal quantity of 'S' and 'M' ingredients .
Given a Balanced Diet  split it in the maximum amount of balanced sub diets

Return the maximum amount of splitted balanced diets

Sample Test Case - 1
input = SMSSMMSMSM
output = 4
Explanation: Diet can be split into "SM", "SSMM", "SM", "SM", each Sub Diet contains same
number of 'M' and 'S'.

Sample Test Case - 2
Input  = SMMMMSSSMS
output = 3
Explanation: Diet can be split into "SM", "MMMSSS", "MS", each Sub Diet contains same
number of 'M' and 'S'.

Sample Test Case - 3
Input  = "MMMMSSSS"
output = 1
Explanation: Diet can be split into only one Diet "MMMMSSSS".

*/

import java.util.*;

public class d46p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ans = 0, res = 0;
        for (int i = 0; i < str.length(); i++) {
            res += (str.charAt(i) == 'M' ? 1 : -1);
            if (res == 0)
                ans++;
        }
        System.out.println(ans);
        sc.close();
    }
}
