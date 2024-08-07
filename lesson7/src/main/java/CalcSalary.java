public class CalcSalary {
    public static double calcSalary(User user) {
        return 1000 * user.getProfession().getCoeff() * user.getWorkExperience();
    }

    // Метод для расчета зарплаты с доплатой
    public static double calcSalaryBonus(double bonus, User user) {
        return calcSalary(user) + bonus;
    }
}