/*
 * Домашнее задание.
 ** Задание 12.1
 *** Создать коллекцию пользователей.
 *** У каждого пользователя есть следующие поля:
 **** -имя (не уникальное);
 **** -стаж работы (пусть будет уникальное для всех);
 **** -список задач (любое представление - можно строками, можно обьектами).
 *** Найти всех пользователей, у который количество задач больше 2.
 *** Вывести всех пользователей по стажу работы (от большего к меньшему).
 *** Вывести только уникальные имена пользователей.
 ***
 *** Используйте для этого наиболее подходящие коллекции
 ***
 */

import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("Иван", 5, List.of("Задача 1", "Задача 2", "Задача 3")));
        users.add(new User("Алексей", 3, List.of("Задача 1")));
        users.add(new User("Мария", 7, List.of("Задача 1", "Задача 2", "Задача 3", "Задача 4")));
        users.add(new User("Сергей", 2, List.of("Задача 1", "Задача 2")));
        users.add(new User("Ольга", 4, List.of("Задача 1", "Задача 2", "Задача 3", "Задача 4", "Задача 5")));

        System.out.println("Пользователи с количеством задач больше 2:");
        users.stream()
                .filter(user -> user.getTasks().size() > 2)
                .forEach(user -> System.out.println(user.getName()));

        System.out.println("\nПользователи по стажу работы (от большего к меньшему):");
        users.stream()
                .sorted(Comparator.comparingInt(User::getExperience).reversed())
                .forEach(user -> System.out.println(user.getName() + " - " + user.getExperience() + " лет"));

        System.out.println("\nУникальные имена пользователей:");
        users.stream()
                .map(User::getName)
                .distinct()
                .forEach(System.out::println);
    }
}