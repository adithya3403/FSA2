/*

write a java program to read the number in string format and print the second largest digit based on frequency.
print -1 for other bounday conditions.

example:
123412213
output =
3

explanation:
frequency of 1 is 3
frequency of 2 is 3
frequency of 3 is 2, so print 3

input = 
9797793333
output =
9
7
explanation:
frequency of 9 is 3
frequency of 7 is 3
frequency of 3 is 4, so print 9 and 7( in the order they occur insertion order)


input = 456
output = -1

here we dont have second frequency count so print -1

input = 11
output = -1

case = 1
input =
123412213
output =
3

case = 2
input = 
9797793333
output =
9
7

case = 3
input = 1111
output = -1

case = 4
input = 1112223334444
output =
1
2
3

case = 5
input = 104441112204
output =
0
2

case = 6
input = 123
output = -1

case = 7
input = 2244
output = -1

case = 8
input = 5
output = -1

*/

import java.util.*;

public class d4p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        secondHighest(str);
        sc.close();
    }

    static void secondHighest(String str) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            int key = str.charAt(i) - '0';
            if (map.containsKey(key))
                map.put(key, map.get(key) + 1);
            else
                map.put(key, 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        Map<Integer, List<Integer>> map2 = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : list) {
            int key = entry.getValue();
            int value = entry.getKey();
            if (map2.containsKey(key)) {
                map2.get(key).add(value);
            } else {
                List<Integer> list2 = new ArrayList<>();
                list2.add(value);
                map2.put(key, list2);
            }
        }
        int count = 0;
        for (Map.Entry<Integer, List<Integer>> entry : map2.entrySet()) {
            if (count == 1) {
                for (int i : entry.getValue())
                    System.out.println(i);
                return;
            }
            count++;
        }
        System.out.println(-1);
    }
}