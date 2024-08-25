/*
1.Необходимо написать один из простых алгоритмов сортировки,
имеющий сложность O(n2
).
2.Можно выбрать из пузырьковой сортировки, сортировки вставками и
сортировки выбором.
3.Следует обратить внимание на сложность данных алгоритмов и
указать признаки квадратичной сложности для каждого из них.
 */
package Seminars.Seminar_02;

public class task1 {

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

    public static void main(String[] args) {
        int N = 10;
        int[] Array = new int[N];
        for (int i = 0; i < N; i++) {
            Array[i] = (int)(Math.random() * 100);
            System.out.printf("%d ", Array[i]);
        }

        System.out.println();

        BubbleSort(Array);

        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", Array[i]);
        }
    }
}
