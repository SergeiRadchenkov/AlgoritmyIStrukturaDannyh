/*
1. Необходимо написать алгоритм поиска всех доступных комбинаций
(посчитать количество) для количества кубиков K с количеством граней N.
2. У вас есть 2 варианта на выбор – количество кубиков может быть строго
ограничено (4 кубика, например), либо их количество будет динамическим.
Выбор за вами.
3. Если вы реализуете простой вариант, обращает внимание, что данное
решение имеет сложность O(n4), но если количество кубиков сделать
переменной, то она трансформируется в O(nk), что будет представлять
собой экспоненциальную сложность. Для второго решения очевидно, что
его сложность O(nk) с самого начала.
 */
package Seminars.Seminar_01;

public class task3 {

    public static int comb_1(int n) {
        int count = 0;
        for (int a = 1; a <= n; a++)
            for (int b = 1; b <= n; b++)
                for (int c = 1; c <= n; c++)
                    for (int d = 1; d <= n; d++)
                        count++;
        return count;
    }

    public static int comb_2(int k, int n) {
        if (k > 0)
            return comb_2_rec(1, k, n);
        return 0;
    }

    private static int comb_2_rec(int h, int k, int n) {
        if (h == k + 1)
            return 1;
        int count = 0;
        for (int i=1; i<=n; i++){
            count += comb_2_rec(h+1, k, n);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(comb_1(6));
        System.out.println(comb_2(4, 6));
    }
}
