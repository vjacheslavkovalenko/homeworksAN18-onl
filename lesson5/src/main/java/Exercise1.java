/*
 * Домашнее задание.
 ** Задание 1
 *** Создать класс CreditCard c полями номер счета, текущая сумма на счету.
 *** Добавьте метод, который позволяет начислять сумму на кредитную карточку.
 *** Добавьте метод, который позволяет снимать с карточки некоторую сумму.
 *** Добавьте метод, который выводит текущую информацию о карточке.
 *** Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма
 **** Тестовый сценарий для проверки:
 **** Положите деньги на первые две карточки и снимите с третьей.
 **** Выведите на экран текущее состояние всех трех карточек
 */

import java.util.Scanner;

public class Exercise1 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            CreditCard card1 = new CreditCard(123456789, 1000);
            CreditCard card2 = new CreditCard(987654321, 2000);
            CreditCard card3 = new CreditCard(456123789, 500);

            System.out.println("Положить деньги на Карточку1:");
            long addMoney = scanner.nextLong();
            card1.addMoney(addMoney);

            System.out.println("Положить деньги на Карточку2:");
            addMoney = scanner.nextLong();
            card2.addMoney(addMoney);

            System.out.println("Снять деньги с Карточки3:");
            long outMoney = scanner.nextLong();
            card3.outMoney(outMoney);

            System.out.println(" Конечный баланс на карточках: ");
            card1.printInfo();
            card2.printInfo();
            card3.printInfo();

    }

}
