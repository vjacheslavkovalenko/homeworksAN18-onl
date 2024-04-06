import java.util.Scanner;

/*
 * Домашнее задание.
 ** Управляющие конструкции
 *** Задача 1. Написать программу для вывода названия поры года по номеру месяца.
 */
public class SeasonsSwitchCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        int numberOfMonth = scanner.nextInt();
        //String season;

        switch (numberOfMonth) {
            case 12:
                System.out.println("Зима");
                break;
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Введён неверный номер месяца.");
        }
    }
}
