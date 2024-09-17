/*
 * Домашнее задание.
 ** Задание 15.1
 *** Создать поток используя два способа - через наследованное и имплементируя интерфейс Runnable.
 *** Оба потока должны стартовать, после чего основной поток должен дождать ся их завершения и прекратить работу.
 */


public class Exercise1 {
    public static void main(String[] args) {

        MyThread thread1 = new MyThread();
        thread1.start();

        Thread thread2 = new Thread(new MyRunnable());
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Основной поток завершен.");
    }
}