public class Exercise2 {
//В данной программе мы создаем массив из 10 целых чисел, заполняем его случайными значениями от 0 до 99,
// находим максимальное, минимальное и среднее значения в массиве, и выводим их.
    //
    public static void main(String[] args) {
        int[] numbers = new int[10]; // Создаем массив из 10 элементов

        // Заполняем массив случайными числами
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100); // Заполняем случайными числами от 0 до 99
        }

        // Выводим массив
        System.out.println("Массив случайных чисел: " + Arrays.toString(numbers));

        // Находим максимальное и минимальное значения
        int max = numbers[0];
        int min = numbers[0];
        int sum = 0;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            sum += num;
        }

        // Выводим максимальное, минимальное и среднее значения
        float average = (float) sum / numbers.length;
        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Среднее значение: " + average);
    }

}
