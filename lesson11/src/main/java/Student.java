//Вот пример программы на Java, которая реализует класс Student с указанными полями и функционалом. Мы будем использовать коллекцию ArrayList для хранения студентов и Stream API для выполнения различных операций.

//Описание программы
//1.Класс Student:
//-Содержит поля для имени, пола, возраста и списка предметов.
//-Имеет конструктор и геттеры для доступа к полям.
//2.Класс StudentManagement:
//-Создает список студентов и заполняет его данными.
//-Реализует функционал для фильтрации студентов по заданным критериям:
//--Вывод всех юношей.
//--Поиск студентов старше 20 лет.
//--Поиск студентов, посещающих менее 2 занятий.
//--Поиск студентов, посещающих занятие "Программирование".


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    private String name;
    private String gender;
    private int age;
    private List<String> subjects;

    public Student(String name, String gender, int age, List<String> subjects) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public List<String> getSubjects() {
        return subjects;
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Заполнение коллекции студентами
        students.add(new Student("Иван", "Мужской", 19, List.of("Математика", "Программирование")));
        students.add(new Student("Алексей", "Мужской", 22, List.of("История")));
        students.add(new Student("Мария", "Женский", 21, List.of("Программирование", "Физика")));
        students.add(new Student("Сергей", "Мужской", 20, List.of("Программирование", "Математика")));
        students.add(new Student("Ольга", "Женский", 18, List.of("Химия")));
        students.add(new Student("Дмитрий", "Мужской", 23, List.of("Программирование", "История", "Математика")));

        // Вывод всех юношей
        System.out.println("Все юноши:");
        students.stream()
                .filter(student -> student.getGender().equals("Мужской"))
                .forEach(student -> System.out.println(student.getName()));

        // Найти всех студентов старше 20 лет
        System.out.println("\nСтуденты старше 20 лет:");
        students.stream()
                .filter(student -> student.getAge() > 20)
                .forEach(student -> System.out.println(student.getName()));

        // Найти всех студентов, которые посещают менее 2 занятий
        System.out.println("\nСтуденты, посещающие менее 2 занятий:");
        students.stream()
                .filter(student -> student.getSubjects().size() < 2)
                .forEach(student -> System.out.println(student.getName()));

        // Найти всех студентов, которые посещают занятие - программирование
        System.out.println("\nСтуденты, посещающие занятие 'Программирование':");
        students.stream()
                .filter(student -> student.getSubjects().contains("Программирование"))
                .forEach(student -> System.out.println(student.getName()));
    }
}

