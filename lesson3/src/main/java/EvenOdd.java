/*
 * Домашнее задание.
 ** Управляющие конструкции
 *** Задача 3. Напишите программу, которая будет принимать на вход число и на выход будет выводить сообщение
 *** четное число или нет.
 *** Для определения четности числа используйте операцию получения остатка от деления - операция выглядит так: '% 2').
 */

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Число " + number + " чётное.");
        } else {
            System.out.println("Число " + number + " нечётное.");
        }
    }

}
