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
        String time = sc.nextLine();
        String first = time.substring(0, 2);
        if (time.substring(time.length() - 2).equals("PM"))
            first = Integer.toString(Integer.parseInt(first) + 12);
        else if (first.equals("12"))
            first = "00";
        System.out.println(first + time.substring(2, time.length() - 2));
        sc.close();
    }
}