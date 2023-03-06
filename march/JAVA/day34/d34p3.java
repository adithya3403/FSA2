/*

Write the java code to calculate and print the table of a given number n.

Use Multi Threading Concept. 
Create Necessary Synchonized methods and classes.

Sample input = 5
Calculated 5*1=5
Printed 5*1=5
Calculted 5*2 = 10
Printed 5*2=10
Calculated 5*3=15
Printed 5*3=15
Calculated 5*4=20
Printed 5*4=20
Calculated 5*5=25
Printed 5*5=25

*/

import java.util.*;

public class d34p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Table t = new Table(n);
        Producer p = new Producer(t);
        Consumer c = new Consumer(t);
        p.start();
        c.start();
        sc.close();
    }
}


class Table {
    int n;

    Table(int n) {
        this.n = n;
    }

    synchronized void calculate(int i) {
        System.out.println("Printed " + n + "*" + i + "=" + n * i);
    }
}


class Producer extends Thread {
    Table t;

    Producer(Table t) {
        this.t = t;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            t.calculate(i);
        }
    }
}


class Consumer extends Thread {
    Table t;

    Consumer(Table t) {
        this.t = t;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Calculated " + t.n + "*" + i + "=" + t.n * i);
        }
    }
}
