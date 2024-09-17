/*
 * Домашнее задание.
 ** Задание 11
 *** Необходимо создать класс Student со следующими полями:
 **** -имя;
 **** -пол;
 **** -возраст;
 **** -список занятий, которые студент посещает (любое представление).
 *** Необходимо заполнить коллекцию несколькими студентами.
 ***
 *** Необходимо реализовать следующий функционал:
 **** -вывести всех юношей;
 **** -найти всех студентов старше 20 лет;
 **** -найти всех студентов, которые посещают менее 2 занятий;
 **** -найти всех студентов, которые посещают занятие - программирование.
 */


import java.util.ArrayList;
import java.util.List;

public class Main {

        public static void main(String[] args) {
            List<Student> students = new ArrayList<>();

            students.add(new Student("Петя", "Мужской", 19, List.of("Математика", "Программирование")));
            students.add(new Student("Алексей", "Мужской", 22, List.of("English")));
            students.add(new Student("Мария", "Женский", 21, List.of("Программирование", "Физика")));
            students.add(new Student("Сергей", "Мужской", 20, List.of("Программирование", "Математика")));
            students.add(new Student("Ольга", "Женский", 18, List.of("Химия")));
            students.add(new Student("Дмитрий", "Мужской", 23, List.of("Программирование", "English", "Математика")));

            System.out.println("Все юноши:");
            students.stream()
                    .filter(student -> student.getGender().equals("Мужской"))
                    .forEach(student -> System.out.println(student.getName()));

            System.out.println("\nСтуденты старше 20 лет:");
            students.stream()
                    .filter(student -> student.getAge() > 20)
                    .forEach(student -> System.out.println(student.getName()));

            System.out.println("\nСтуденты, посещающие менее 2 занятий:");
            students.stream()
                    .filter(student -> student.getSubjects().size() < 2)
                    .forEach(student -> System.out.println(student.getName()));

            System.out.println("\nСтуденты, посещающие занятие 'Программирование':");
            students.stream()
                    .filter(student -> student.getSubjects().contains("Программирование"))
                    .forEach(student -> System.out.println(student.getName()));
        }

}