/*

write a  java program to count the GrandChild/Child for given name 

Assume the relations here limit only to child and grandChild only 
all the inputs will be given in lower case characters(a-z) and are valid relations 

the first line of input consists of number of relations followed by child name and fathers name seperated by ',' 
followed by a name. 



Where the first string is "Child", second string is "Father".
If the given name is Father print the count of his children
If the given name is GrandFather print the count of his GrandChildren

Print -1 for any other boundary conditions 

for given input like this

input =
5
kishore,ramesh
dev,gopal
gopal,ramu
srinu,gopal
praveen,ranjit
ramu
output = 2

And given input "ramu" we have to find his no of grandchildren/child
Here "ramu" has one direct child gopal and gopal has 2 children(dev,srinu).
So ramu has 2 grand children dev,srinu. so output is 2

example:2 

input =
5
ranjit,knr
ramesh,pradeep
kittu,ranjit
yogesh,ranjit
praveen,ranjit
knr
output=
3

//given data for knr we need print the count of grand children . 
here knr direct child is ranjit and ranjit has three children   ---- kittu,yogesh,praveen so print 3


input = 
8
a,b
c,b
d,b
f,a
g,a
e,a
m,c
z,d
b
output =
5

TEST CASES:

case = 1
input = 
5
kishore,ramesh
dev,gopal
gopal,ramu
srinu,gopal
praveen,ranjit
ramu
output =
2

case = 2
input = 
8
a,b
c,b
d,b
f,a
g,a
e,a
m,c
z,d
b
output =
5

case = 3
input = 
5
ranjit,knr
ramesh,pradeep
kittu,krishna
yogesh,sridhar
praveen,chaitanya
knr
output =
1

case = 4
input = 
8
a,b
c,b
d,b
f,a
g,a
e,a
m,c
z,d
a
output = 3

case = 5
input = 
8
a,b
c,b
d,b
e,b
f,b
g,b
h,b
i,k
b
output = 7

case = 6
input = 
8
a,b
c,b
d,b
e,b
f,b
g,b
h,b
dddd,a
a
output = 1

case = 7
input = 8
a,b
c,b
d,b
e,b
f,b
g,b
h,b
i,b
abcd
output = -1

case = 8
input = 
12
a,c
b,c
d,a
e,a
f,a
g,a
h,a
i,b
j,b
k,b
l,b
m,b
c
output = 10

*/

import java.util.*;

public class d8p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.next();
        String name = sc.next();
        Map<String, String> map = new LinkedHashMap<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            String[] temp = arr[i].split(",");
            map.put(temp[0], temp[1]);
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, String> tp : map.entrySet())
            if (tp.getValue().equals(name))
                list.add(tp.getKey());
        for (Map.Entry<String, String> tp : map.entrySet())
            if (list.contains(tp.getValue()))
                count++;
        if (count == 0 && list.size() == 0)
            System.out.println(-1);
        else if (count == 0 && list.size() != 0)
            System.out.println(list.size());
        System.out.println(count);
        sc.close();
    }
}