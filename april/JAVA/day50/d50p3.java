/*

Sridhar brought his latest Apple iPhone 12 pro. 
He started his conversation with one of his friend on WhatsApp with list of words.

Now it’s our task to find and return what are the most common words in the list of words he used in sorted order based on occurrence from 
largest to smallest. If any of words he used are having same occurrence then consider the lexicographic order.

You will be given a list of words, you need to print top P number of most common used words as described in the statement. 

Input Format:
-------------
Line-1: comma separated line of words, list of words.
Line-2: An integer P, number of words to display. 

Output Format:
--------------
Print P number of most common used words.


Sample Input-1:
---------------
ball,are,case,doll,egg,case,doll,egg,are,are,egg,case,are,egg,are,case
3

Sample Output-1:
----------------
[are, case, egg]



Sample Input-2:
---------------
ball,are,case,doll,egg,case,doll,egg,are,are,egg,case,are,egg,are
3

Sample Output-2:
----------------
[are, egg, case]

*/

import java.util.*;
public class d50p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(",");
        int p = sc.nextInt();
        System.out.println(mostCommonWords(words, p));
        sc.close();
    }
    static List<String> mostCommonWords(String[] words, int p) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            if (map.get(a) == map.get(b)) {
                return b.compareTo(a);
            }
            return map.get(a) - map.get(b);
        });
        for (String word : map.keySet()) {
            pq.add(word);
            if (pq.size() > p) {
                pq.poll();
            }
        }
        List<String> res = new ArrayList<>();
        while (!pq.isEmpty()) {
            res.add(pq.poll());
        }
        Collections.reverse(res);
        return res;
    }
}