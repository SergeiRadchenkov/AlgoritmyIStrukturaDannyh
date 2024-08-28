/*
1.Реализуем метод добавления новых элементов в начало списка и удаление
первого элемента связного списка.
2.Односвязный список всегда имеет ссылку на первый элемент
последовательности, потому именно с реализации методов для первого
элемента последовательности стоит начать
 */
package Seminars.Seminar_03;

public class task2 {
    public static void main(String[] args) {
        List1 list = new List1();
        for (int i = 1; i <= 5; i++)
            list.pushFront(i);

        list.print();

        list.popFront();
        list.popFront();

        list.print();
    }
}


class List1 {
    Node head;

    class Node {
        int value;
        Node next;
    }

    public void pushFront(int value) {
        Node node = new Node();
        node.value = value;
        node.next = head;
        head = node;
    }

    public void popFront() {
        if (head != null) {
            head = head.next;
        }
    }

    public void print() {
        Node cur = head;
        while (cur != null) {
            System.out.printf("%d ", cur.value);
            cur = cur.next;
        }
        System.out.println();
    }
}