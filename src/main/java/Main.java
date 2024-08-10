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


// Пользовательское исключение для неверного логина
//class WrongLoginException extends Exception {
//    public WrongLoginException() {
//        super();
//    }
//
//    public WrongLoginException(String message) {
//        super(message);
//    }
//}

// Пользовательское исключение для неверного пароля
//class WrongPasswordException extends Exception {
//    public WrongPasswordException() {
//        super();
//    }
//
//    public WrongPasswordException(String message) {
//        super(message);
//    }
//}

// Класс с методом для проверки логина и пароля
//public class UserValidator {
//
//    public static void validateCredentials(String login, String password, String confirmPassword)
//            throws WrongLoginException, WrongPasswordException {
//
//        // Проверка логина
//        if (login.length() >= 20) {
//            throw new WrongLoginException("Логин не должен превышать 20 символов.");
//        }
//
//        // Проверка пароля
//        if (password.length() >= 20) {
//            throw new WrongPasswordException("Пароль не должен превышать 20 символов.");
//        }
//
//        if (!password.equals(confirmPassword)) {
//            throw new WrongPasswordException("Пароль и подтверждение пароля не совпадают.");
//        }
//    }

    // Метод для тестирования
    public static void main(String[] args) {
        // Примеры для проверки
        String login = "user123";
        String password = "pass123";
        String confirmPassword = "pass123";

        try {
            Validation.validateCredentials(login, password, confirmPassword);
            System.out.println("Данные валидны.");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Тест с ошибочными данными
        String invalidLogin = "thisLoginIsWayTooLongForTheSystem";
        String invalidPassword = "short";
        String invalidConfirmPassword = "different";

        try {
            Validation.validateCredentials(invalidLogin, invalidPassword, invalidConfirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}