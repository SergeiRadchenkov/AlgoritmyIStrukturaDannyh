/*
В классе Answer реализуйте метод reverse, который принимал бы на вход односвязный список и разворачивал бы его.
 */
package Seminars.Seminar_03.HW;

class Node1 {
    int val;
    Node1 next;

    public Node1(int val) {
        this.val = val;
    }
}

class Answer1 {
    Node1 head;

    public void reverse() {
        if (head != null && head.next != null) {
            reverse(head, head.next);
        }
    }

    private void reverse(Node1 current, Node1 next) {
        if (next.next != null) {
            reverse(next, next.next);
        } else {
            head = next;
        }

        next.next = current;
        current.next = null;
    }
}

class Printer1 {

    public static void main(String[] args) {
        // Создаем список для тестирования
        Node1 head;
        if (args.length == 0) {
            head = new Node1(1);
            head.next = new Node1(2);
            head.next.next = new Node1(3);
            head.next.next.next = new Node1(4);
        } else {
            head = new Node1(Integer.parseInt(args[0]));
            head.next = new Node1(Integer.parseInt(args[1]));
            head.next.next = new Node1(Integer.parseInt(args[2]));
            head.next.next.next = new Node1(Integer.parseInt(args[3]));
        }

        // Разворачиваем список
        Answer1 ans = new Answer1();
        ans.head = head;
        ans.reverse();

        // Выводим результат
        Node1 current = ans.head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}

