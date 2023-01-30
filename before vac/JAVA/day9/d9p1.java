/*

Tubby a Third Class Student has given a Assignment on Time Chapter by his class teacher.
Tubby is supposed to change the time given in AM/PM Format to 24 Hours Format. 
Help Tubby Solve the Problem 

The Maths teacher gave him the time in the following Format - HH:MM:SS:AM/PM

Assume all HH,MM,SS are in the valid range only 
 
Note: Midnight is 12:00:00AM on a 12-hour clock,  and 00:00:00 on a 24-hour clock. 
Noon is 12:00:00PM on a 12-hour clock,  and 12:00:00 on a 24-hour clock. 
     
Assume all input times are valid

Back end test cases

input = 06:10:20PM
output = 18:10:20

input = 01:45:50PM
output = 13:45:50

input = 10:05:30AM
output = 10:05:30

input = 02:13:19AM
output = 02:13:19

*/

import java.util.*;

public class d9p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(convertedTime(s));
        sc.close();
    }

    static String convertedTime(String s) {
        StringBuilder sb = new StringBuilder();
        int hh = Integer.parseInt(s.substring(0, 2));
        int mm = Integer.parseInt(s.substring(3, 5));
        int ss = Integer.parseInt(s.substring(6, 8));
        String ampm = s.substring(8, 10);
        if (ampm.equals("PM")) {
            if (hh != 12)
                hh += 12;
        } else {
            if (hh == 12)
                hh = 0;
        }
        sb.append(hh < 10 ? "0" + hh : hh);
        sb.append(":");
        sb.append(mm < 10 ? "0" + mm : mm);
        sb.append(":");
        sb.append(ss < 10 ? "0" + ss : ss);
        return sb.toString();
    }
}