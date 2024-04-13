/*
 * Домашнее задание.
 ** Циклы
 *** Задача 4. Необходимо, чтоб программа выводила на экран вот такую последовательность:
 ***  7 14 21 28 35 42 49 56 63 70 77 84 91 98.
 *** В решении используйте цикл while
 */

public class Subsequence {

    public static void main(String[] args) {
        int seven = 7;
        while (seven <= 98) {
            System.out.print(seven + " ");
            seven += 7;
        }
    }

}
