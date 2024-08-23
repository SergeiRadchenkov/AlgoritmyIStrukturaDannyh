/*
Необходимо сравнить скорость работы 2 алгоритмов вычисления чисел
Фибоначчи и определить, какой из них работает быстрее. Так различия
начнутся уже с 40 члена последовательности.
 */
package Seminars.Seminar_01;

import java.util.Date;

public class task6 {

    public static void test() {
        for (int n = 10; n <= 45; n++) {
            Date start = new Date();
            fib_rec(n);
            Date end = new Date();
            long time1 = end.getTime() - start.getTime();

            start = new Date();
            fib_lin(n);
            end = new Date();
            long time2 = end.getTime() - start.getTime();

            System.out.printf("n: %d, rec: %d, lin: %d%n", n, time1, time2);
        }
    }

    public static int fib_rec(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 1;
        return fib_rec(n-1) + fib_rec(n-2);
    }

    public static int fib_lin(int n) {
        final int[] numbers = new int[n+1];
        numbers[1] = 1;
        numbers[2] = 1;

        for (int i = 3; i <= n; i++)
            numbers[i] = numbers[i - 1] + numbers[i - 2];

        return numbers[n];
    }

    public static void main(String[] args) {
        test();
    }
}
