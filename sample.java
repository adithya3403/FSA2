// find quotient and remainder without / and %

public class sample {
    public static void main(String[] args) {
        int a = 21;
        int b = 3;
        int q = 0;
        while (a >= b) {
            a -= b;
            q++;
        }
        System.out.println(q + " " + a);
    }
}