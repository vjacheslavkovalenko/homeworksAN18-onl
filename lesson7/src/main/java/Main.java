public class Main {
    public static void main(String[] args) {
        // Создаем пользователей
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

        // Проверяем метод с доплатой
        double bonus = 500; // размер доплаты
        double salaryBonus1 = CalcSalary.calcSalaryBonus(bonus,user1);
        double salaryBonus2 = CalcSalary.calcSalaryBonus(bonus,user2);
        double salaryBonus3 = CalcSalary.calcSalaryBonus(bonus,user3);

        System.out.println("Зарплата: " + user1.getName() + " (с доплатой) = " + salaryBonus1 );
        System.out.println("Зарплата: " + user2.getName() + " (с доплатой) = " + salaryBonus2 );
        System.out.println("Зарплата: " + user3.getName() + " (с доплатой) = " + salaryBonus3 );

    }
}