/*
 * Домашнее задание к 6 уроку.
 * Задание 1.1
 *** 1.1 Создать класс Person с 3-мя полями (имя, возраст, зарплата).
 ***
 *** 1.2 Переопределить для этого класса hashCode(придумать свою формулу), toString(чтобы выдавал всю информацию по человеку).
 ***
 *** 1.3 Создать класс Cat и добавить в Person поле этого типа (Cat). Соответственно изменить toString().
 ***
 *** 1.4 В main создать объект Person, клонировать его, и поменять для копии имя. Проверить в консоли с
 *** помощью toString что имена оригинала и копии действительно разные. Сравнить объекты между собой используя equals.
 */

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private double salary;
    private Cat cat;

    public Person(String name, int age, double salary, Cat cat) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        //return "Person{" +
        return "Name: " + name + ", Age: " + age + ", Salary: " + salary + ". Name cat: " + cat;
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result +Objects.hashCode(age);
        result = 31 * result +Objects.hashCode(salary);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Double.compare(person.salary, salary) == 0 &&
                Objects.equals(name, person.name);
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Kitty");
        Person person = new Person("Петр", 30, 150000, cat);
        Person clone = new Person(person.getName(), person.getAge(), person.getSalary(), person.getCat());
        clone.setName("Павел");
        System.out.println("Original: " + person);
        System.out.println("Clone: " + clone);
        System.out.println("Equals: " + person.equals(clone));
    }
}
