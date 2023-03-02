package day32;
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
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printPattern(n);
        sc.close();
    }
    static void printPattern(int n) {
        int[] dp=new int[n+1];
        dp[1]=1;
        System.out.println(dp[1]);
        for(int i=2;i<=n;i++){
            int temp=dp[i-1];
            int count=0;
            while(temp>0){
                int rem=temp%10;
                if(rem==1)
                    count++;
                else
                    count=0;
                temp/=10;
            }
            dp[i]=dp[i-1]*10+count;
            System.out.println(dp[i]);
        }
    }
}