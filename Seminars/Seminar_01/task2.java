/*
Написать алгоритм поиска простых чисел (делятся только на себя и
на 1) в диапазоне от 1 до N. В алгоритме будет использоваться
вложенный for, что явно говорит о квадратичной сложности, на этом
стоит акцентировать внимание
 */
package Seminars.Seminar_01;

import java.util.ArrayList;

public class task2 {

    public static ArrayList<Integer> findSimpleNumbers(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        boolean simple = true;
        for (int i=2; i<=n; i++) {
            simple = true;
            for (int j=2; j<i; j++) {
                if (i%j==0) {
                    simple = false;
                    break;
                }
            }
            if (simple) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> result = findSimpleNumbers(100);
        for (Integer i: result)
            System.out.println(i);
    }
}
