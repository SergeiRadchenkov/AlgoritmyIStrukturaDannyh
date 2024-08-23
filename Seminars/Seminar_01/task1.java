/*
Необходимо написать алгоритм, считающий сумму всех чисел
от 1 до N. Согласно свойствам линейной сложности,
количество итераций цикла будет линейно изменяться
относительно изменения размера N.
 */
package Seminars.Seminar_01;

public class task1 {

    public static int sum(int n) {
        int result = 0;
        for (int i=1; i<=n; i++)
            result += i;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}
