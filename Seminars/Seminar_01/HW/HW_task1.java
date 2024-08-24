/*
Дано целое число N из отрезка [1: 1000]. Также даны N целых чисел Ai из отрезка [1: 1000000].
Требуется для каждого числа Ai вывести количество различных делителей этого числа.
В этой задаче несколько верных решений, попробуйте найти наиболее оптимальное.
Для полученного решения укажите сложность в O-нотации.
 */
package Seminars.Seminar_01.HW;

public class HW_task1 {

    public static int calc(int a) {
        int result = 0;
        for (int i = 1; i * i <= a; i++) {
            if (a % i == 0) {
                result++;
                if (i * i != a) {
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int N = 1000;
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = (int)(Math.random() * 100 + 1);
        }
        for (int i = 0; i < N; i++) {
            System.out.println(numbers[i] + " : " + calc(numbers[i]));
        }
    }
}
