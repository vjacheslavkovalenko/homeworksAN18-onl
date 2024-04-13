/*
 * Домашнее задание.
 ** Циклы
 *** Задача 3. Напишите программу, где пользователь вводит любое целое положительное число.
 *** А программа суммирует все числа от 1 до введенного пользователем числа.
 *** Для ввода числа воспользуйтесь классом Scanner.
 */

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
        int number = scanner.nextInt();

        int result = 0;

        for (int i = 1; i <= number; i++) {
            result = result + i;
        }

        System.out.println("Сумма равна " + result);
    }

}
