
/*

write a java program to create a User Defined Exception
"Maximum Funds allowed is 10K"

write necessary classes and methods

the first line of input contains the initial balance followed by 
the amount to deposited in bank. 

Sample Test Case-1

input = 4000
5000
output = 9000

Sample Test Case-2
input = 6000
5000
output = Maximum Funds allowed is 10K

*/

import java.util.*;

class maxBalanceExceededException extends Exception {
    private int bal;

    public int getBalance() {
        return bal;
    }

    public maxBalanceExceededException(String s, int amount) {
        super(s);
        bal = amount;
    }
}

class account {
    private int balance;

    public account(int bal) {
        balance = bal;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amt) throws maxBalanceExceededException {
        if (balance + amt > 10000)
            throw new maxBalanceExceededException("Maximum Funds allowed is 10K", balance);
        balance += amt;
    }
}

public class d31p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        account a = new account(sc.nextInt());
        try {
            a.deposit(sc.nextInt());
            System.out.println(a.getBalance());
        } catch (maxBalanceExceededException mbe) {
            System.out.println(mbe.getMessage());
        } finally {
            sc.close();
        }
    }
}