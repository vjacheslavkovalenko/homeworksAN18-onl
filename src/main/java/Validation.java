public class Validation {

    public static void validateCredentials(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        // Проверка логина
        if (login.length() >= 20) {
            throw new WrongLoginException("Логин не должен превышать 20 символов.");
        }

        // Проверка пароля
        if (password.length() >= 20) {
            throw new WrongPasswordException("Пароль не должен превышать 20 символов.");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароль и подтверждение пароля не совпадают.");
        }
    }
}
