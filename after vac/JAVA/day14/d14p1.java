/*

In this challenge you will create the username portion of a registation system.
All usernames must be unique. If a new user requests a name that is already used,
an integer should be added to the end of the username to make it unique. 
The numbering begins with 1 and is incremented by 1 for each new instance per username.

As an example, if username requests were for [bob,bob,alice,alice,alice], 
your system should assign usernames[bob,bob1,alice,alice1,alice2].

input format:
no of usernames
list of usernames one in each row

output format:
list of updated usernames one in each row

input =
4
alex
xylos
alex
alan
output =
alex
xylos
alex1
alan

Explanation :

There are 4 usernames . Each of the usernames is unique with the exception of  "alex".
so for first duplicate request for the username "alex" you need to update it with "alex1"

*/

import java.util.*;

public class d14p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                int val = map.get(arr[i]);
                map.put(arr[i], val + 1);
                arr[i] = arr[i] + val;
            } else {
                map.put(arr[i], 1);
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}