

//Описание программы
//Создаются два класса: PrintOne и PrintTwo, которые выводят цифры "1" и "2" соответственно.
//Используется один объект lock для синхронизации, чтобы гарантировать, что один поток завершает свою работу, прежде чем другой начнет.
//Каждый поток выводит свою цифру три раза с задержкой.

class PrintOne extends Thread {
    private final Object lock;

    public PrintOne(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 0; i < 3; i++) {
                System.out.println("1");
                try {
                    Thread.sleep(500); // Задержка для демонстрации
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class PrintTwo extends Thread {
    private final Object lock;

    public PrintTwo(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 0; i < 3; i++) {
                System.out.println("2");
                try {
                    Thread.sleep(500); // Задержка для демонстрации
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class Task4 {
    public static void main(String[] args) {
        Object lock = new Object(); // Объект для синхронизации

        PrintOne thread1 = new PrintOne(lock);
        PrintTwo thread2 = new PrintTwo(lock);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Оба потока завершены.");
    }
}