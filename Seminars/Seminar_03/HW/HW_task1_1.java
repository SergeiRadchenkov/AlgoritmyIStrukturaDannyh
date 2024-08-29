/*
В классе Answer реализуйте метод reverse, который принимал бы на вход односвязный список и разворачивал бы его.
 */
package Seminars.Seminar_03.HW;

class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;

    }
}

class Answer {
    Node head;
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current !=null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
}

class Printer {
    public static void main(String[] args) {
        Node head;
        if (args.length == 0) {
            head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
        } else {
            head = new Node(Integer.parseInt(args[0]));
            head.next = new Node(Integer.parseInt(args[1]));
            head.next.next = new Node(Integer.parseInt(args[2]));
            head.next.next.next = new Node(Integer.parseInt(args[3]));
        }

        Answer ans = new Answer();
        ans.head = head;
        ans.reverse();

        Node current = ans.head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
