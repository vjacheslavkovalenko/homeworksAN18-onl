
//Описание программы
//Создается класс MyThread, который наследует Thread, и переопределяет метод run().
//Создается класс MyRunnable, который реализует интерфейс Runnable и переопределяет метод run().
//В основном методе создаются и запускаются оба потока, после чего основной поток ждет их завершения с помощью метода join().


class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Поток, созданный через наследование, работает.");
        try {
            Thread.sleep(1000); // Имитация работы
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Поток, созданный через наследование, завершен.");
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Поток, созданный через интерфейс Runnable, работает.");
        try {
            Thread.sleep(1000); // Имитация работы
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Поток, созданный через интерфейс Runnable, завершен.");
    }
}

public class Task1 {
    public static void main(String[] args) {
        // Создание потока через наследование
        MyThread thread1 = new MyThread();
        thread1.start();

        // Создание потока через интерфейс Runnable
        Thread thread2 = new Thread(new MyRunnable());
        thread2.start();

        try {
            // Ожидание завершения потоков
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Основной поток завершен.");
    }
}