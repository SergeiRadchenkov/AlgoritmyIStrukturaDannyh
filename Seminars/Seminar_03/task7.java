/*
1.Добавляем метод сортировки для связного списка.
2.Можно использовать любой алгоритм, что мы использовали на предыдущем
семинаре, но с точки зрения работы связного списка лучше ориентироваться на
пузырьковую сортировку, т.к. она взаимодействует с соседними элементами, а
не только по индексам, как делают все остальные сортировки.
 */
package Seminars.Seminar_03;

public class task7 {
    public static void main(String[] args) {
        List6 list = new List6();
        for (int i = 10; i >= 1; i--)
            list.pushBack(i);

        list.sort();

        list.print();
    }
}

class List6 {
    Node head;
    Node tail;

    class Node {
        int value;
        Node next;
        Node prev;
    }

    public void pushFront(int value) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
        }
        head = node;
    }

    public void popFront() {
        if (head != null) {
            if (head.next == null) {
                head = null;
                tail = null;
            } else {
                head = head.next;
            }
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

    public boolean consist(int value) {
        Node cur = head;
        while (cur != null) {
            if (cur.value == value) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public void pushBack(int value) {
        Node node = new Node();
        node.value = value;

        if (head == null) {
            head = node;
        } else {
            tail.next = node;
            node.prev = tail;
        }
        tail = node;
    }

    public void popBack() {
        if (tail != null) {
            if (tail.prev == null) {
                head = null;
                tail = null;
            } else {
                tail = tail.prev;
            }
        }
    }

    public void sort() {
        boolean needSort = true;
        do {
            needSort = false;
            Node node = head;
            while (node != null && node.next != null) {
                if (node.value > node.next.value) {
                    Node before = node.prev;
                    Node cur = node;
                    Node next = node.next;
                    Node after = node.next.next;

                    cur.prev = next;
                    cur.next = after;
                    next.prev = before;
                    next.next = cur;

                    if (before != null) {
                        before.next = next;
                    } else {
                        head = next;
                    }
                    if (after != null) {
                        after.prev = cur;
                    } else {
                        tail = cur;
                    }

                    needSort = true;
                }
                node = node.next;

            }
        } while (needSort);
    }

}
