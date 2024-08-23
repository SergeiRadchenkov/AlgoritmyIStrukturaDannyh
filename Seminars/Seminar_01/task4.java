/*
1. Пишем алгоритм поиска нужного числа последовательности Фибоначчи.
2. Считаем, что 1 и 2 значения последовательности равны 1.
3. Искать будем по формуле On=On-1+On-2 что предполагает использовать
рекурсивного алгоритма.
 */
package Seminars.Seminar_01;

public class task4 {

    public static int fib_rec(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 1;
        return fib_rec(n-1) + fib_rec(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fib_rec(10));
    }
}
