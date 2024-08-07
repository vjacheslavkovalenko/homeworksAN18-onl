/*
 * Домашнее задание.
 ** Задание 1
 *** Необходимо создать класс User со следующими полями:
 ***	имя - строковой параметр;
 ***	профессия - enum (DIRECTOR, WORKER, HR);
 ***	стаж работы - число.
 *** Так же надо создать метод, который будет выводить зарплату данного пользователя.
 *** Подсчет зп должен учитывать стаж работы и профессию (1000 * стаж работы * коэффициент профессии).
 ***
 *** Создайте несколько пользователей с разными параметрами.
 *** Выведете зп каждого сотрудника.
 ***
 *** Создайте еще один метод подсчета зп, но он должен принимать параметр - доп оплата.
 *** Его задача - подсчитывать ЗП и добавлять к ней доп плату.
 *** Проверить правильность работы данного метода.
 **************************************************************
 ** Задание 2
 *** 2.1 Создать классы Dog, Cat, Main и интерфейс Voice c методом doVoice().
 *** 2.2 В Dog и Cat имплементировать данный интерфейс и реализовать метод doVoice().
 *** 2.3 В классе Main создать объекты Dog, Cat и вызвать метод doVoice().
 */

public class Main {
    public static void main(String[] args) {
        // Создаю пользователей
        User user1 = new User("Алексей", Profession.DIRECTOR, 5);
        User user2 = new User("Мария", Profession.PROGRAMMER, 3);
        User user3 = new User("Петр", Profession.HR, 7);

        // Расчет зарплаты каждого сотрудника
        double salary1 = CalcSalary.calcSalary(user1);
        double salary2 = CalcSalary.calcSalary(user2);
        double salary3 = CalcSalary.calcSalary(user3);

        //Вывод зарплаты каждого сотрудника
        System.out.println("Зарплата: " + user1.getName() + " (" + user1.getProfession().getName() + ") = " + salary1);
        System.out.println("Зарплата: " + user2.getName() + " (" + user2.getProfession().getName() + ") = " + salary2);
        System.out.println("Зарплата: " + user3.getName() + " (" + user3.getProfession().getName() + ") = " + salary3);

        // Проверяю метод с доплатой
        double bonus = 500; // размер доплаты
        double salaryBonus1 = CalcSalary.calcSalaryBonus(bonus,user1);
        double salaryBonus2 = CalcSalary.calcSalaryBonus(bonus,user2);
        double salaryBonus3 = CalcSalary.calcSalaryBonus(bonus,user3);

        System.out.println("Зарплата: " + user1.getName() + " (с доплатой) = " + salaryBonus1 );
        System.out.println("Зарплата: " + user2.getName() + " (с доплатой) = " + salaryBonus2 );
        System.out.println("Зарплата: " + user3.getName() + " (с доплатой) = " + salaryBonus3 );

        // Создаю объекты Dog и Cat
        Voice dog = new Dog();
        Voice cat = new Cat();

        // Вызываю метод doVoice() для каждого объекта
        dog.doVoice(); // Вывод: Гав!
        cat.doVoice(); // Вывод: Мяу!

    }
}