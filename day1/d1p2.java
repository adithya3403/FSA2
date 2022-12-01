/*

Mr.Bob and Mr.Cob are working on a Military Mission. 
They are supposed to encode the message and send the message to the under-cover team.

Where Cob has written a script. Where the Script says double all the ascii values other than mentioned in the bracket
(97,101,105,111,117,65,69,73,79,85) and place a '#' in between. 

Help Bob in writing the Code. 


Sample Test Case-1
input = attack the enemy
output = at#tt#tac#ck#k t#th#he en#nem#my#y

*/

import java.util.*;

public class d1p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        solve(str);
        sc.close();
    }

    static void solve(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (isVowel(c)) {
                System.out.print(c);
            } else {
                System.out.print(c + "#" + c);
            }
        }
    }

    static boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }
}