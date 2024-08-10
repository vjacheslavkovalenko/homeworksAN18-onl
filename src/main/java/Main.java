/*
 * Домашнее задание.
 ** Задание.
 *** Создать класс, в котором будет статический метод. Этот метод принимает на вход три параметра:
 *** login, password, confirmPassword. Все поля имеют тип данных String. Длина login должна быть
 *** меньше 20 символов. Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
 *** Длина password должна быть меньше 20 символов.
 *** Также password и confirmPassword должны быть равны.
 *** Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
 *** WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя
 *** конструкторами – один по умолчанию, второй принимает сообщение исключения и передает его в
 *** конструктор класса Exception.
 *** Проверить работу метода на валидных и ошибочных данных
 */

public class Main {

    public static void main(String[] args) {

        String login = "user123";
        String password = "pass123";
        String confirmPassword = "pass123";

        try {
            Validation.validateCredentials(login, password, confirmPassword);
            System.out.println("Данные валидны.");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        String invalidLogin = "thisLoginIsWayTooLonggggggggggggggggggggggggggggg";
        String invalidPassword = "short";
        String invalidConfirmPassword = "different";

        try {
            Validation.validateCredentials(invalidLogin, invalidPassword, invalidConfirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}