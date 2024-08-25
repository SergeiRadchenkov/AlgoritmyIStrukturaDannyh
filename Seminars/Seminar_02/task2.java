/*
1.Написать алгоритм быстрого поиска (quicksort).
 */
package Seminars.Seminar_02;

public class task2 {

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
        int N = 10;
        int[] Array = new int[N];
        for (int i = 0; i < N; i++) {
            Array[i] = (int)(Math.random() * 100);
            System.out.printf("%d ", Array[i]);
        }

        System.out.println();

        QuickSort(Array);

        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", Array[i]);
        }
    }
}
