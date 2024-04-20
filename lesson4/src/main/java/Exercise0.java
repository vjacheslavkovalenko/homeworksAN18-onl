import java.util.Scanner;

public class Exercise0 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 10, 45, 18};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int searchNumber = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchNumber) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Число " + searchNumber + " найдено в массиве.");
        } else {
            System.out.println("Число " + searchNumber + " не найдено в массиве.");
        }
    }

}
