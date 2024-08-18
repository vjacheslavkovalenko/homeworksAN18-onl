public class Worker extends Employee {
    public Worker(String firstName, String lastName, int experience) {
        super(firstName, lastName, experience, Position.WORKER);
    }

    @Override
    public void printInfo() {
        System.out.println("Работник: " + getFullName() + ", Стаж: " + getExperience() + " лет, Должность: " + getPosition());
    }
}