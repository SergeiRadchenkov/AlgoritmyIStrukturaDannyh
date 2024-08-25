/*
1.Пишем тесты для сравнения производительности сортировки больших
массивов.
2.Для наглядного результата стоит сравнивать массивы до 100 000 элементов.
При таком подходе будет явно видно, какая из сортировок окажется быстрее
 */
package Seminars.Seminar_02;

import java.util.Date;

public class task3 {

    public static void BubbleSort(int[] Array) {
        boolean needSort = true;
        do {
            needSort = false;
            for (int i = 0; i < Array.length - 1; i++) {
                if (Array[i] > Array[i + 1]) {
                    int temp = Array[i];
                    Array[i] = Array[i + 1];
                    Array[i + 1] = temp;

                    needSort = true;
                }
            }
        } while (needSort);
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
        int[] Array2 = new int[N];
        for (int i = 0; i < N; i++) {
            Array1[i] = (int)(Math.random() * 100);
            Array2[i] = Array1[i];
        }

        Date start = new Date();
        BubbleSort(Array1);
        Date end = new Date();
        long time1 = end.getTime() - start.getTime();

        start = new Date();
        QuickSort(Array2);
        end = new Date();
        long time2 = end.getTime() - start.getTime();

        System.out.printf("time1 = %d, time2 = %d%n", time1, time2);
    }
}
