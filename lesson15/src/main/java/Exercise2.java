/*
 * Домашнее задание.
 ** Задание 15.2
 *** Есть массив целых чисел.
 *** Необходимо создать два потока - один из которых будет считать максимальное значение, а второй - минимальное.
 *** Запустить оба потока и дождаться их окончания. Вывести на экран результат вычислений.
 */


public class Exercise2 {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 4, 9, 2};

        MaxValueThread maxThread = new MaxValueThread(numbers);
        MinValueThread minThread = new MinValueThread(numbers);

        maxThread.start();
        minThread.start();

        try {
            maxThread.join();
            minThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Оба потока завершены.");
    }
}