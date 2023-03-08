/*

Cliff Shaw is working on the singly linked list.
He is given a list of boxes arranged as singly linked list,
where each box is printed a positive number on it.

Your task is to help Mr Cliff to find the given list is equivalent to 
the reverse of it or not. If yes, print "true", otherwise print "false"

Input Format:
-------------
Line-1: space separated integers, boxes as list.

Output Format:
--------------
Print a boolean a value.


Sample Input-1:
---------------
3 6 2 6 3

Sample Output-1:
----------------
true


Sample Input-2:
---------------
3 6 2 3 6

Sample Output-2:
----------------
false

*/

import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}


class Solution {
    // Function to check whether the list is palindrome.
    Node getmid(Node head) {
        // write your code here

        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    Node reverse(Node head) {
        // write your code here

        Node prev = null;
        Node curr = head;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;

    }


    boolean isPalindrome(Node head) {
        // if (head.next == null) {
        //     return true;
        // }

        // Node middle = getmid(head);
        // Node temp = middle.next;
        // middle.next = reverse(temp);

        // Node head1 = head;
        // Node head2 = middle.next;

        // while (head2 != null) {
        //     if (head1.data != head2.data) {
        //         return false;
        //     }
        //     head1 = head1.next;
        //     head2 = head2.next;
        // }

        // temp = middle.next;
        // middle.next = reverse(temp);

        // return true;

        Stack<Integer> stack = new Stack<>();
        Node temp = head;
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }
        boolean flag = true;
        while (head != null) {
            int i = stack.pop();
            if (head.data == i) {
                flag = true;
            } else {
                flag = false;
                break;
            }
            head = head.next;
        }
        return flag;
    }
}


public class PalindromeList {

    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PalindromeList list = new PalindromeList();
        String list2[] = sc.nextLine().split(" ");
        for (int i = 0; i < list2.length; i++)
            list.addNode(Integer.parseInt(list2[i]));
        Solution sl = new Solution();
        System.out.println(sl.isPalindrome(list.head));
        sc.close();
    }
}
