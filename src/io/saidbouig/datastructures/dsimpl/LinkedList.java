package io.saidbouig.datastructures.dsimpl;

public class LinkedList {


    private Node head;

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.append(0);
        llist.append(1);

        llist.printList();

        //System.out.println(lengthOfLastWord(" ") );
        System.out.println(isPalindrome("0P"));

    }

    public static int lengthOfLastWord(String s) {
        if (s.length() == 0) return 0;
        String[] parts = s.split(" ");
        System.out.println(parts.length);
        return parts[parts.length - 1].length();
    }

    public static boolean isPalindrome(String s) {
        //clean string
        s = s.replaceAll("[^A-Za-z0]", "").trim().toLowerCase().replaceAll(" ", "");
        System.out.println(s);
        if (s.length() <= 1) return true;

        if (s.length() == 2)
            if (s.charAt(0) == s.charAt(1))
                return true;
            else
                return false;
        int n = s.length() / 2;
        for (int i = 0; i <= n; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }
        return true;

    }

    void printList() {
        Node n = head;

        while (n != null) {
            System.out.println(n.value);
            n = n.next;
        }
    }

    void push(int data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    void append(int data) {
        Node n = new Node(data);

        if (head == null) {
            head = n;
            return;
        }

        Node current = head;


        while (current.next != null) {
            current = current.next;
        }
        current.next = n;
    }

    void pushAfter(Node previous, int data) {
        if (previous == null) {
            return;
        }

        Node n = new Node(data);
        n.next = previous.next;
        previous.next = n;

    }

    class Node {

        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }


}
