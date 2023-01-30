/*

Shyam has given a positive number 'N'.
Now his sir has given a homework to print all numbers with unique digits below 'N'

Sample Test Case-1

input = 100
output = 1 2 3 4 5 6 7 8 9 10 12 13 14 15 16 17 18 19 20 21 23 24 25 26 27 28 29 30 31 32 34 35 36 37 38 39 40 41 42 43 
45 46 47 48 49 50 51 52 53 54 56 57 58 59 60 61 62 63 64 65 67 68 69 70 71 72 73 74 75 76 78 79 80 81 82 83 84 85 86 87 89 90 91 92 93 94 95 96 97 98

Sample Test Case-2
input = 10
output = 1 2 3 4 5 6 7 8 9 10

*/

import java.util.*;

public class d1p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            Set<Integer> set = new HashSet<>();
            int temp = i;
            while (temp > 0) {
                int rem = temp % 10;
                if (set.contains(rem))
                    break;
                set.add(rem);
                temp /= 10;
            }
            if (temp == 0)
                System.out.print(i + " ");
        }
        sc.close();
    }
}