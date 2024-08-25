/*
1.После успешной сортировки массива на нем можно использовать бинарный
поиск. Необходимо реализовать алгоритм бинарного поиска по
элементам.
2.Стоит акцентировать внимание, что т.к. алгоритм использует подход
«разделяй и властвуй», его удобно писать с помощью рекурсии.
3.Так что стоит акцентировать внимание на алгоритмическую сложность
данного алгоритма, что его выполнение многократно быстрее простого
перебора на больших массивах
 */
package Seminars.Seminar_02;

import java.util.Date;

public class task4 {

    public static Integer BinarySearch(int[] Array, int value) {
        int left = 0, right = Array.length - 1;
        while (right - left > 1) {
            int mid = (left + right) / 2;
            if (Array[mid] < value)
                left = mid;
            else
                right = mid;
        }
        if (Array[left] == value)
            return left;
        if (Array[right] == value)
            return right;

        return null;
    }

    public static void QuickSort(int[] Array) {
        QuickSort(Array, 0, Array.length - 1);

    }

    private static void QuickSort(int[] Array, int left, int right) {
        int i = left;
        int j = right;
        int pivot = Array[(left + right) / 2];

        do {
            while (Array[i] < pivot) {
                i++;
            }
            while (Array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                if (i < j) {
                    int temp = Array[i];
                    Array[i] = Array[j];
                    Array[j] = temp;
                }
                i++;
                j--;
            }
        } while (i <= j);

        if (left < j) {
            QuickSort(Array, left, j);
        }

        if (i <= right) {
            QuickSort(Array, i, right);
        }
    }

    public static void main(String[] args) {
        int N = 20000;
        int[] Array1 = new int[N];
        for (int i = 0; i < N; i++) {
            Array1[i] = (int)(Math.random() * 100);
        }

        QuickSort(Array1);

        System.out.println(BinarySearch(Array1, 42));
    }
}
