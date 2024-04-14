import java.util.Arrays;
import java.util.Random;

public class Exercise2 {

    public static void main(String[] args) {
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            Random ran = new Random();
            numbers[i] = ran.nextInt(50);
        }

        System.out.println("Массив случайных чисел: " + Arrays.toString(numbers));

        int max = numbers[0];
        int min = numbers[0];
        int sum = 0;
        for (int item : numbers) {
            if (item > max) {
                max = item;
            }
            if (item < min) {
                min = item;
            }
            sum += item;
        }

        float average = (float) sum / numbers.length;
        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Среднее значение: " + average);
    }

}
