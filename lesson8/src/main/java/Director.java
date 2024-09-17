import java.util.ArrayList;
import java.util.List;

public class Director extends Employee {
    private List<Employee> subordinates;

    public Director(String firstName, String lastName, int experience) {
        super(firstName, lastName, experience, Position.DIRECTOR);
        this.subordinates = new ArrayList<>();
    }

    public void add(Employee employee) {
        subordinates.add(employee);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public void printInfo() {
        System.out.println("Директор: " + getFullName() + ", Стаж: " + getExperience() + " лет, Должность: " + getPosition());
        System.out.println("Подчиненные:");
        for (Employee subordinate : subordinates) {
            subordinate.printInfo();
        }
    }

    public boolean hasSubordinate(String name) {
        for (Employee subordinate : subordinates) {
            if (subordinate.getFullName().equals(name)) {
                return true;
            }
            if (subordinate instanceof Director) {
                if (((Director) subordinate).hasSubordinate(name)) {
                    return true;
                }
            }
        }
        return false;
    }
}