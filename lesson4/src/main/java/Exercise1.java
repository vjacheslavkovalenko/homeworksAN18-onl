import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 2}; // пример массива целых чисел

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для удаления: ");
        int targetNumber = scanner.nextInt();

        int count = 0; // счетчик для подсчета количества вхождений числа

        // Подсчитываем количество вхождений числа
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == targetNumber) {
                count++;
            }
        }

        // Создаем новый массив без вхождений заданного числа
        int[] newNumbers = new int[numbers.length - count];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != targetNumber) {
                newNumbers[index] = numbers[i];
                index++;
            }
        }

        if (count > 0) {
            System.out.println("Новый массив без числа " + targetNumber + ": ");
            for (int num : newNumbers) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("Заданное число " + targetNumber + " не найдено в массиве.");
        }
    }

}
