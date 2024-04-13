/*
 * Домашнее задание.
 ** Управляющие конструкции
 *** Задача 4. Для введенного числа t (температура на улице) вывести
 ***  Если t>–5, то вывести «Тепло».
 ***  Если –5>= t > –20, то вывести «Нормально».
 ***  Если –20>= t, то вывести «Холодно».
 */

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру на улице: ");
        int temperature = scanner.nextInt();

        if (temperature <= -20) {
            System.out.println("Холодно");
        } else if (temperature <= -5) {
            System.out.println("Нормально");
        } else {
            System.out.println("Тепло");
        }
    }

}
