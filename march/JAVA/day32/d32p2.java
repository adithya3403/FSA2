/*

Bob is working on numbers.
For any given number 'n' , n>0.
print the following pattern 

n=5
output =
1
11
12
1121
122111

n=6
output=
1
11
12
1121
122111
112213

*/

import java.util.*;

public class d32p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
        sc.close();
    }

    static void printPattern(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append("1");
        System.out.println(sb);
        for (int i = 2; i <= n; i++) {
            StringBuilder temp = new StringBuilder();
            int count = 1;
            for (int j = 1; j < sb.length(); j++) {
                if (sb.charAt(j) == sb.charAt(j - 1)) {
                    count++;
                } else {
                    temp.append(count);
                    temp.append(sb.charAt(j - 1));
                    count = 1;
                }
            }
            temp.append(count);
            temp.append(sb.charAt(sb.length() - 1));
            sb = temp;
            // System.out.println(sb);
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < sb.length(); j++) {
                list.add(sb.charAt(j) - '0');
            }
            for (int j = 0; j < list.size() / 2; j++) {
                int temp1 = list.get(j);
                list.set(j, list.get(list.size() - j - 1));
                list.set(list.size() - j - 1, temp1);
            }
            StringBuilder ans = new StringBuilder();
            for (int j = 0; j < list.size(); j++) {
                ans.append(list.get(j));
            }
            System.out.println(ans);
        }
    }
}
