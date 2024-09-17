/*
 * Домашнее задание.
 ** Задание 13.2
 *** Создать стрим из чисел (бесконечно увеличивающихся на 1).
 **** 1) Найти среднее значение первых 10 чисел.
 **** 2) Пропустить 5 чисел и вывести следующие 10 чисел, которые делятся на 3 без остатка.
 **** 3) Посчитать сумму 20 подряд идущих чисел.
 */


import java.util.stream.IntStream;

public class Exercise2 {
    public static void main(String[] args) {
        // 1) Найти среднее значение первых 10 чисел
        double average = IntStream.iterate(1, i -> i + 1)
                .limit(10)
                .average()
                .orElse(0.0);
        System.out.printf("Среднее значение первых 10 чисел: %.2f%n", average);

        // 2) Пропустить 5 чисел и вывести следующие 10 чисел, которые делятся на 3 без остатка
        System.out.println("\nСледующие 10 чисел после пропуска 5, делящиеся на 3 без остатка:");
        IntStream.iterate(1, i -> i + 1)
                .skip(5)
                .filter(i -> i % 3 == 0)
                .limit(10)
                .forEach(System.out::println);

        // 3) Посчитать сумму 20 подряд идущих чисел
        int sum = IntStream.iterate(1, i -> i + 1)
                .limit(20)
                .sum();
        System.out.printf("\nСумма 20 подряд идущих чисел: %d%n", sum);
    }
}