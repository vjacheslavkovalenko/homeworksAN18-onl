
//Описание программы
//Создаются два класса: MaxValueThread для поиска максимального значения и MinValueThread для поиска минимального значения.
//Каждый поток ищет свое значение в массиве, и после завершения потоков результаты выводятся на экран.

class MaxValueThread extends Thread {
    private final int[] numbers;
    private int maxValue;

    public MaxValueThread(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        maxValue = numbers[0];
        for (int number : numbers) {
            if (number > maxValue) {
                maxValue = number;
            }
        }
        System.out.println("Максимальное значение: " + maxValue);
    }

    public int getMaxValue() {
        return maxValue;
    }
}

class MinValueThread extends Thread {
    private final int[] numbers;
    private int minValue;

    public MinValueThread(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        minValue = numbers[0];
        for (int number : numbers) {
            if (number < minValue) {
                minValue = number;
            }
        }
        System.out.println("Минимальное значение: " + minValue);
    }

    public int getMinValue() {
        return minValue;
    }
}

public class Task2 {
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