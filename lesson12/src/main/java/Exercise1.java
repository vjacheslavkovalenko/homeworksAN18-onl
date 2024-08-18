
//Задание 1
//В этом задании мы создадим класс User с полями для имени, стажа работы и списка задач. Затем мы реализуем функционал для поиска пользователей по заданным критериям.


//Описание программы
//1.Класс User:
//-Содержит поля для имени, стажа работы и списка задач.
//-Имеет конструктор и геттеры для доступа к полям.
//2.Класс UserManagement:
//-Создает список пользователей и заполняет его данными.
//-Реализует функционал для фильтрации пользователей по заданным критериям:
//--Пользователи с количеством задач больше 2.
//--Пользователи, отсортированные по стажу работы.
//--Уникальные имена пользователей.


import java.util.*;

class User {
    private String name;
    private int experience; // стаж работы
    private List<String> tasks;

    public User(String name, int experience, List<String> tasks) {
        this.name = name;
        this.experience = experience;
        this.tasks = tasks;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public List<String> getTasks() {
        return tasks;
    }
}

public class UserManagement {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        // Заполнение коллекции пользователей
        users.add(new User("Иван", 5, List.of("Задача 1", "Задача 2", "Задача 3")));
        users.add(new User("Алексей", 3, List.of("Задача 1")));
        users.add(new User("Мария", 7, List.of("Задача 1", "Задача 2", "Задача 3", "Задача 4")));
        users.add(new User("Сергей", 2, List.of("Задача 1", "Задача 2")));
        users.add(new User("Ольга", 4, List.of("Задача 1", "Задача 2", "Задача 3", "Задача 4", "Задача 5")));

        // Найти всех пользователей, у которых количество задач больше 2
        System.out.println("Пользователи с количеством задач больше 2:");
        users.stream()
                .filter(user -> user.getTasks().size() > 2)
                .forEach(user -> System.out.println(user.getName()));

        // Вывести всех пользователей по стажу работы (от большего к меньшему)
        System.out.println("\nПользователи по стажу работы (от большего к меньшему):");
        users.stream()
                .sorted(Comparator.comparingInt(User::getExperience).reversed())
                .forEach(user -> System.out.println(user.getName() + " - " + user.getExperience() + " лет"));

        // Вывести только уникальные имена пользователей
        System.out.println("\nУникальные имена пользователей:");
        users.stream()
                .map(User::getName)
                .distinct()
                .forEach(System.out::println);
    }
}